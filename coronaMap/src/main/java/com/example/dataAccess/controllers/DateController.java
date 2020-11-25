package com.example.dataAccess.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dataAccess.services.DateService;

@RestController
public class DateController {
	
	@Autowired
	private DateService dateService;
	
	@GetMapping("/week")
	public List<Integer> countWeek(){
		return dateService.weekCount();
	}
	
	@GetMapping("/twoWeek")
	public List<Integer> countTwoWeek(){
		return dateService.twoWeekCount();
	}
	
	@GetMapping("/month")
	public List<Integer> countMonth(){
		return dateService.monthCount();
	}
	
	@GetMapping("/twoMonth")
	public List<Integer> countTwoMonth(){
		return dateService.twoMonthCount();
	}

}
