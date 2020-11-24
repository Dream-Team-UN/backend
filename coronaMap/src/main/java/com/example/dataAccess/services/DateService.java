package com.example.dataAccess.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dataAccess.repositories.DateRepository;

@Service
public class DateService {

	public List<Integer> weekCount() {

		Date date = new Date();
		DateFormat format = new SimpleDateFormat("d/M/yyyy");
		String fecha = format.format(date);

		ArrayList<Integer> count = new ArrayList<>();

		for (int i = 0; i < 7; i++) {
			count = (ArrayList<Integer>) DateRepository.weekCase(fecha);
			fecha = DateRepository.day(fecha);
		}

		return count;

	}

	public List<Integer> twoWeekCount() {

		Date date = new Date();
		DateFormat format = new SimpleDateFormat("d/M/yyyy");
		String fecha = format.format(date);

		ArrayList<Integer> twoWeekCount = new ArrayList<Integer>();

		for (int i = 0; i < 14; i++) {
			twoWeekCount = (ArrayList<Integer>) DateRepository.twoWeekCase(fecha);
			fecha = DateRepository.day(fecha);
		}

		return twoWeekCount;

	}

	public List<Integer> monthCount() {

		Date date = new Date();
		DateFormat format = new SimpleDateFormat("d/M/yyyy");
		String fecha = format.format(date);

		ArrayList<Integer> monthCount = new ArrayList<Integer>();

		for (int i = 0; i < 30; i++) {
			monthCount = (ArrayList<Integer>) DateRepository.monthCase(fecha);
			fecha = DateRepository.day(fecha);
		}

		return monthCount;

	}
	
	public List<Integer> twoMonthCount() {

		Date date = new Date();
		DateFormat format = new SimpleDateFormat("d/M/yyyy");
		String fecha = format.format(date);

		ArrayList<Integer> twoMonthCount = new ArrayList<Integer>();

		for (int i = 0; i < 60; i++) {
			twoMonthCount = (ArrayList<Integer>) DateRepository.twoMonthCase(fecha);
			fecha = DateRepository.day(fecha);
		}

		return twoMonthCount;

	}

}
