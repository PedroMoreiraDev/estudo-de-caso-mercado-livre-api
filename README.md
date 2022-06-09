# mercado-livre-api

``` 

#Instruções de Uso

1 - acesse o arquivo get-token-mercado-livre-api e o execute

2 - acesse a sua URL de autorização conforme a documentação para obter o code: https://auth.mercadolivre.com.br/authorization?response_type=code&client_id=$APP_ID&redirect_uri=$YOUR_URL$state=$RANDOM_ID

3 - Pegue o code e insira junto com seu client id e client secret no arquivo token da 
pasta get-token-mercado-livre-api\src\main\resources\json
4 - Rode novamente a aplicação e terá seu token.
5 - execute na aplicação mercado-livre-app o client referente ao tipo de requisição a 
ser executada (get ou post) utilizando o token conforme a documentação.
fim.``` 
