package com.meli.easy.mercado.livre.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.time.Duration;

@SpringBootApplication
public class MercadoLivreApiApplication {

	public static final String URL_POST = "https://api.mercadolibre.com/oauth/token";
	public static final String URL_GET = "https://auth.mercadolivre.com.br/authorization?response_type=code&client_id=6979377820219331&redirect_uri=https://localhost:443/login";
	public static final String FILE_JSON = "..\\get-token-mercado-livre-api\\src\\main\\resources\\json\\token.json";

	public static void main(String[] args)  throws IOException, InterruptedException {
		SpringApplication.run(MercadoLivreApiApplication.class, args);

		// cliente HTTP
		HttpClient client = HttpClient.newHttpClient();

		// get para pegar o CODE
		HttpRequest getrequest = HttpRequest.newBuilder()
				.GET()
				.timeout(Duration.ofSeconds(10))
				.uri(URI.create(URL_GET))
				.build();

		// post para trazer o TOKEN
		HttpRequest request = HttpRequest.newBuilder()
				.POST(HttpRequest.BodyPublishers.ofFile(Path.of(FILE_JSON)))
				.timeout(Duration.ofSeconds(10))
				.uri(URI.create(URL_POST))
				.build();

		//print do link de redirecionamento do CODE
		client.sendAsync(getrequest, HttpResponse.BodyHandlers.ofString())
				.thenApply(HttpResponse::body)
				.thenAccept(System.out::println)
				.join();

		System.out.println(getrequest.bodyPublisher());

		//print do link de redirecionamento do TOKEN
		client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
				.thenApply(HttpResponse::body)
				.thenAccept(System.out::println)
				.join();

		System.out.println(request.bodyPublisher());



	}

}
