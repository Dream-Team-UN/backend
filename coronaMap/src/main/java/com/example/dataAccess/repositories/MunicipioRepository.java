package com.example.dataAccess.repositories;

import java.net.http.HttpResponse;

import org.json.JSONArray;
import org.json.JSONException;

import com.example.dataAccess.databases.ClientConnect;

public class MunicipioRepository {
	
	ClientConnect client = new ClientConnect();
	
public JSONArray getAllMunicipe() {
		
		return client.getClient().sendAsync(client.ClientRequest("?$select=distinct%20ciudad_de_ubicaci_n,%20departamento&$order=departamento"),
				HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body).thenApply(MunicipioRepository::getAllMunicipe).join();
	}
	
	public static JSONArray getAllMunicipe(String responseBody) {
		
		JSONArray arrayMunicipe = null;
		try {
			arrayMunicipe = new JSONArray(responseBody);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arrayMunicipe;
	}

}
