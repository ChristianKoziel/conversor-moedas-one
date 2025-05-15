# 💱 Conversor de Moedas - Challenge ONE (Oracle Next Education)

Este projeto foi desenvolvido como parte do programa **Oracle Next Education (ONE)** em parceria com a **Alura** e o **Grupo Algar**.

## 🧠 Descrição

O Conversor de Moedas em Java é um programa de linha de comando que utiliza uma API real para realizar conversões entre as principais moedas do mundo.

O projeto tem como objetivo aplicar conhecimentos de:
- Requisições HTTP com `HttpClient`
- Manipulação de JSON com `Gson`
- Boas práticas de organização em Java

## 🔁 Funcionalidades

- Conversão entre:
    - USD ↔ BRL
    - EUR ↔ BRL
    - ARS ↔ BRL
    - CLP ↔ BRL
- Busca de taxa de câmbio em tempo real usando a API [ExchangeRate-API](https://www.exchangerate-api.com/)
- Interface no terminal com menu interativo

## 📦 Tecnologias usadas

- Java 17+
- Biblioteca [Gson](https://github.com/google/gson) para leitura de JSON
- `HttpClient` para consumo da API

## 🚀 Como executar

1. Clone o repositório:

```bash
git clone https://github.com/ChristianKoziel/conversor-moedas-one.git
cd conversor-moedas-one/src
