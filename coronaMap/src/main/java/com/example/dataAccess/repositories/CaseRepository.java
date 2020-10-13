package com.example.dataAccess.repositories;

import java.net.http.HttpResponse;

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

		return client.getClient().sendAsync(client.ClientRequest("?$select=count(id_de_caso)"), HttpResponse.BodyHandlers.ofString())
				.thenApply(HttpResponse::body).thenApply(CaseRepository::totalCases).join();

	}

	public static int totalCases(String responseBody) {
		JSONObject total = null;
		try {
			total = new JSONObject(responseBody.substring(1, responseBody.length()-1));
			return total.getInt("count_id_de_caso");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return -1;
	}

	//Total de infectadoas actuales
	public int actualInfected() {

		return totalCases()-totalDied()-totalRecupered();

	}
	
	//Total de recuperados
	public int totalRecupered() {

		return client.getClient().sendAsync(client.ClientRequest("?atenci_n=Recuperado&$select=count(atenci_n)"), HttpResponse.BodyHandlers.ofString())
				.thenApply(HttpResponse::body).thenApply(CaseRepository::totalRecupered).join();

	}

	public static int totalRecupered(String responseBody) {
		JSONObject recupered;
		try {
			recupered = new JSONObject(responseBody.substring(1, responseBody.length()-1));
			return recupered.getInt("count_atenci_n");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
		
	}
	
	
	//Total de fallecidos
	public int totalDied() {

		return client.getClient().sendAsync(client.ClientRequest("?atenci_n=Fallecido&$select=count(atenci_n)"), HttpResponse.BodyHandlers.ofString())
				.thenApply(HttpResponse::body).thenApply(CaseRepository::totalDied).join();

	}

	public static int totalDied(String responseBody) {

		JSONObject died = null;
		try {
			died = new JSONObject(responseBody.substring(1, responseBody.length()-1));
			return died.getInt("count_atenci_n");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return -1;
	}
	
	public int totalAsintomatics() {

		return client.getClient().sendAsync(client.ClientRequest("?estado=Asintomático&$select=count(estado)"), HttpResponse.BodyHandlers.ofString())
				.thenApply(HttpResponse::body).thenApply(CaseRepository::totalAsintomatics).join();

	}

	public static int totalAsintomatics(String responseBody) {

		JSONObject asintomatic = null;
		try {
			asintomatic = new JSONObject(responseBody.substring(1, responseBody.length()-1));
			return asintomatic.getInt("count_estado");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return -1;
	}

}
