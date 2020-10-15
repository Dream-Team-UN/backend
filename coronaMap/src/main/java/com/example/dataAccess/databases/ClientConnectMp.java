package com.example.dataAccess.databases;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class ClientConnectMp {
	HttpClient client = HttpClient.newHttpClient();
	String url = "https://www.datos.gov.co/resource/xdk5-pm3f.json";
	
	
	
	public HttpClient getClient() {
		return client;
	}

	public HttpRequest ClientRequest(String request) {
		return HttpRequest.newBuilder()
				.uri(URI.create(url + request)).build();
	}
}
