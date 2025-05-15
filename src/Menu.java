import java.util.Scanner;

public class Menu {
    public static void exibirMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("***************************************");
            System.out.println("      CONVERSOR DE MOEDAS JAVA");
            System.out.println("***************************************");
            System.out.println("Escolha a opção de conversão:");
            System.out.println("1 - USD → BRL");
            System.out.println("2 - BRL → USD");
            System.out.println("3 - EUR → BRL");
            System.out.println("4 - BRL → EUR");
            System.out.println("5 - ARS → BRL");
            System.out.println("6 - BRL → ARS");
            System.out.println("7 - CLP → BRL");
            System.out.println("8 - BRL → CLP");
            System.out.println("9 - Sair");
            System.out.println("***************************************");
            System.out.print("Digite a opção desejada: ");

            int opcao = scanner.nextInt();

            if (opcao == 9) {
                System.out.println("\nEncerrando o programa...");
                break;
            }

            System.out.print("Digite o valor a ser convertido: ");
            double valor = scanner.nextDouble();

            String de = "";
            String para = "";

            switch (opcao) {
                case 1 -> { de = "USD"; para = "BRL"; }
                case 2 -> { de = "BRL"; para = "USD"; }
                case 3 -> { de = "EUR"; para = "BRL"; }
                case 4 -> { de = "BRL"; para = "EUR"; }
                case 5 -> { de = "ARS"; para = "BRL"; }
                case 6 -> { de = "BRL"; para = "ARS"; }
                case 7 -> { de = "CLP"; para = "BRL"; }
                case 8 -> { de = "BRL"; para = "CLP"; }
                default -> {
                    System.out.println("Opção inválida!");
                    continue;
                }
            }

            double taxa = Conversor.buscarTaxa(de, para);

            if (taxa != -1) {
                double resultado = valor * taxa;
                System.out.printf("Resultado: %.2f %s\n", resultado, para);
            }

            System.out.println("***************************************\n");
        }

        scanner.close();
    }
}
