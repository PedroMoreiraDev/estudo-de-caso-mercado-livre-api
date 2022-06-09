## Começando
Essas instruções são sobre como pegar o token e executar uma requisição com o repositório já em sua máquina.

## Pegando o Token
Instruções sobre como conseguir o Token de acesso
```bash

- acesse o client da pasta get-token-mercado-livre-api e o execute

- acesse a sua URL de autorização conforme a documentação para obter o code: https://auth.mercadolivre.com.br/authorization?response_type=code&client_id=$APP_ID&redirect_uri=$YOUR_URL$state=$RANDOM_ID

- Pegue o code e insira junto com seu client id e client secret no arquivo token da 
pasta get-token-mercado-livre-api\src\main\resources\json

- Execute novamente a aplicação e terá seu token em seu console.
```

## Fazendo requisições 
Instruções sobre como fazer requisições para a API do Meli

```
 - Após conseguir o token, acesse os clients dentro da pasta aplicação mercado-livre-app e execute o client
 referente ao tipo de requisição que deseja fazer (get ou post) utilizando o token conforme a documentação

```

E pronto, você estará utilizando a API do Mercado Livre

:grinning:
