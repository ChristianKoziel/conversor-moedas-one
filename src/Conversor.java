import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Conversor {

    private static final String API_KEY = "3ab97ebf9debdde1c78d73d4"; // ← coloque sua chave aqui

    public static double buscarTaxa(String de, String para) {
        try {
            String url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + de;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
            JsonObject conversao = json.getAsJsonObject("conversion_rates");

            return conversao.get(para).getAsDouble();
        } catch (Exception e) {
            System.out.println("Erro ao buscar taxa: " + e.getMessage());
            return -1;
        }
    }
}
