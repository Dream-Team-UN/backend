package com.example.dataAccess.repositories;

import java.net.http.HttpResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.example.dataAccess.databases.ClientConnect;

public class CaseRepository {

	ClientConnect client = new ClientConnect();

	public CaseRepository() {
		super();
	}
	
	//Se cuenta el total de casos
	public int totalCases() {

		return client.getClient().sendAsync(client.getRequest(), HttpResponse.BodyHandlers.ofString())
				.thenApply(HttpResponse::body).thenApply(CaseRepository::totalCases).join();

	}

	public static int totalCases(String responseBody) {
		JSONArray array = null;
		try {
			array = new JSONArray(responseBody);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return array.length();
	}

	//Total de infectadoas actuales
	public int actualInfected() {

		return client.getClient().sendAsync(client.getRequest(), HttpResponse.BodyHandlers.ofString())
				.thenApply(HttpResponse::body).thenApply(CaseRepository::actualInfected).join();

	}

	public static int actualInfected(String resposeBody) {

		int counter = 0;
		try {
			JSONArray array = new JSONArray(resposeBody);
			for (int i = 0; i < array.length(); i++) {
				JSONObject cases = array.getJSONObject(i);
				if (!cases.getString("estado").equals("Fallecido")) {
					if (!cases.getString("estado").equals("Recuperado")) {
						counter++;
					}
				}

			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return counter;
	}

	
	//Total de recuperados
	public int totalRecupered() {

		return client.getClient().sendAsync(client.getRequest(), HttpResponse.BodyHandlers.ofString())
				.thenApply(HttpResponse::body).thenApply(CaseRepository::totalRecupered).join();

	}

	public static int totalRecupered(String resposeBody) {

		int counter = 0;
		try {
			JSONArray array = new JSONArray(resposeBody);
			for (int i = 0; i < array.length(); i++) {
				JSONObject cases = array.getJSONObject(i);
				if (cases.getString("estado").equals("Recuperado")) {
					counter++;
				}

			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return counter;
	}
	
	
	//Total de fallecidos
	public int totalDied() {

		return client.getClient().sendAsync(client.getRequest(), HttpResponse.BodyHandlers.ofString())
				.thenApply(HttpResponse::body).thenApply(CaseRepository::totalDied).join();

	}

	public static int totalDied(String resposeBody) {

		int counter = 0;
		try {
			JSONArray array = new JSONArray(resposeBody);
			for (int i = 0; i < array.length(); i++) {
				JSONObject cases = array.getJSONObject(i);
				if (cases.getString("estado").equals("Fallecido")) {
					counter++;
				}

			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return counter;
	}

}
