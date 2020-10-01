package com.example.dataAccess.databases;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class ClientConnect {
	
	HttpClient client = HttpClient.newHttpClient();
	HttpRequest request = HttpRequest.newBuilder()
			.uri(URI.create("https://www.datos.gov.co/resource/gt2j-8ykr.json?$limit=10000")).build();
	
	public ClientConnect(HttpClient client, HttpRequest request) {
		super();
		this.client = client;
		this.request = request;
	}

	public HttpClient getClient() {
		return client;
	}

	public HttpRequest getRequest() {
		return request;
	}

}
