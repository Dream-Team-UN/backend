package com.example.dataAccess.databases;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class ClientConnect {
	
	HttpClient client = HttpClient.newHttpClient();
	String url = "https://www.datos.gov.co/resource/gt2j-8ykr.json";
	
	
	
	public HttpClient getClient() {
		return client;
	}

	public HttpRequest ClientRequest(String request) {
		return HttpRequest.newBuilder()
				.uri(URI.create(url + request)).build();
	}

}
