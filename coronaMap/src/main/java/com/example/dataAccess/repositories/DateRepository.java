package com.example.dataAccess.repositories;

import java.net.http.HttpResponse;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.example.dataAccess.databases.ClientConnect;

public interface DateRepository {

	ClientConnect client = new ClientConnect();
	ArrayList<Integer> countWeek = new ArrayList<>();
	ArrayList<Integer> countTwoWeek = new ArrayList<>();
	ArrayList<Integer> countMonth = new ArrayList<>();
	ArrayList<Integer> countTwoMonth = new ArrayList<>();

	public static String day(String fecha) {
		Date date = parseDate(fecha);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, -1);
		date = calendar.getTime();
		DateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
		fecha = dateFormat.format(date);
		return fecha;
	}

	public static Date parseDate(String date) {
		try {
			return new SimpleDateFormat("dd/MM/yyyy").parse(date);
		} catch (ParseException e) {
			return null;
		}
	}

	public static List<Integer> weekCase(String fecha) {

		return client.getClient()
				.sendAsync(
						client.ClientRequest(
								"?fecha_reporte_web=" + fecha + "%200:00:00&$select=count(fecha_reporte_web)"),
						HttpResponse.BodyHandlers.ofString())
				.thenApply(HttpResponse::body).thenApply(DateRepository::weekCases).join();

	}

	public static List<Integer> weekCases(String responseBody) {

		JSONArray array = null;
		JSONObject count = null;
		try {
			array = new JSONArray(responseBody);
			count = array.getJSONObject(0);
			countWeek.add(count.getInt("count_fecha_reporte_web"));
		} catch (JSONException e) {
			e.printStackTrace();
		}

		return countWeek;

	}

	public static List<Integer> twoWeekCase(String fecha) {

		return client.getClient()
				.sendAsync(
						client.ClientRequest(
								"?fecha_reporte_web=" + fecha + "%200:00:00&$select=count(fecha_reporte_web)"),
						HttpResponse.BodyHandlers.ofString())
				.thenApply(HttpResponse::body).thenApply(DateRepository::twoWeekCases).join();

	}

	public static List<Integer> twoWeekCases(String responseBody) {

		JSONArray array = null;
		JSONObject count = null;
		try {
			array = new JSONArray(responseBody);
			count = array.getJSONObject(0);
			countTwoWeek.add(count.getInt("count_fecha_reporte_web"));
		} catch (JSONException e) {
			e.printStackTrace();
		}

		return countTwoWeek;

	}
	
	public static List<Integer> monthCase(String fecha) {
		
		return client.getClient().sendAsync(client.ClientRequest("?fecha_reporte_web="+fecha+"%200:00:00&$select=count(fecha_reporte_web)"), 
				HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body).thenApply(DateRepository::weekCases).join();
		
	}

	public static List<Integer> monthCases(String responseBody) {

		JSONArray array = null;
		JSONObject count = null;
		try {
			array = new JSONArray(responseBody);
			count = array.getJSONObject(0);
			countMonth.add(count.getInt("count_fecha_reporte_web"));
		} catch (JSONException e) {
			e.printStackTrace();
		}

		return countMonth;

	}
	
	public static List<Integer> twoMonthCase(String fecha) {
		
		return client.getClient().sendAsync(client.ClientRequest("?fecha_reporte_web="+fecha+"%200:00:00&$select=count(fecha_reporte_web)"), 
				HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body).thenApply(DateRepository::twoMonthCases).join();
		
	}

	public static List<Integer> twoMonthCases(String responseBody) {

		JSONArray array = null;
		JSONObject count = null;
		try {
			array = new JSONArray(responseBody);
			count = array.getJSONObject(0);
			countTwoMonth.add(count.getInt("count_fecha_reporte_web"));
		} catch (JSONException e) {
			e.printStackTrace();
		}

		return countTwoMonth;

	}

}
