package com.example.dataAccess.repositories;

import java.net.http.HttpResponse;

import org.json.JSONArray;
import org.json.JSONException;

import com.example.dataAccess.databases.ClientConnect;

public class DepartamentoRepository {
	
	ClientConnect client = new ClientConnect();
	
	public JSONArray getAllDepartament() {
		
		return client.getClient().sendAsync(client.ClientRequest("?$select=distinct%20departamento"), HttpResponse.BodyHandlers.ofString())
				.thenApply(HttpResponse::body).thenApply(DepartamentoRepository::getAllDepartament).join();
	}
	
	public static JSONArray getAllDepartament(String responseBody) {
		
		JSONArray arrayDepartament = null;
		try {
			arrayDepartament = new JSONArray(responseBody);
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arrayDepartament;
		
	}
	
}
