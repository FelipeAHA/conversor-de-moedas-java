# Conversor de Moedas via Console (Java)

Este é um simples conversor de moedas desenvolvido em Java que utiliza a API [ExchangeRate-API](https://www.exchangerate-api.com/) para obter as taxas de câmbio em tempo real. Através de uma interface de console, o usuário pode escolher entre as opções de conversão disponíveis e inserir o valor a ser convertido. O programa então faz a requisição à API, processa os dados JSON recebidos e exibe o valor convertido.

## Funcionalidades

* **Conversão entre diversas moedas:** O programa permite a conversão entre algumas opções de moedas suportadas pela ExchangeRate-API.
* **Interface de console amigável:** Uma interface simples e intuitiva para o usuário selecionar as moedas e inserir o valor.
* **Utilização da ExchangeRate-API:** Busca as taxas de câmbio mais recentes diretamente da API.
* **Tratamento de dados JSON:** Processa a resposta da API no formato JSON para extrair as taxas de câmbio utilizando a biblioteca Gson.
* **Exibição clara do resultado:** Apresenta o valor convertido de forma clara ao usuário.

## Como Utilizar

 **Utilizando o Conversor:**
    * O programa exibirá as opções de moedas disponíveis.
    * Digite o número correspondente à opção desejada para a moeda de origem.
    * Digite o número correspondente à opção desejada para a moeda de destino.
    * Informe o valor que você deseja converter e pressione Enter.
    * O programa consultará a API e exibirá o valor convertido.
    * Siga as instruções no console para realizar novas conversões ou sair do programa.

## Tecnologias Utilizadas

* **Java:** Linguagem de programação utilizada no desenvolvimento.
* **ExchangeRate-API:** API externa para obtenção das taxas de câmbio.
* **JSON:** Formato de dados utilizado na comunicação com a API.
* **Gson:** Biblioteca utilizada para tratamento do JSON.


 
