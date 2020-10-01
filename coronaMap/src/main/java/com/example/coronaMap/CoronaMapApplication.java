package com.example.coronaMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dataAccess.repositories.CaseRepository;


@SpringBootApplication
public class CoronaMapApplication {
	
	static CaseRepository caso = new CaseRepository();

	public static void main(String[] args) {
		SpringApplication.run(CoronaMapApplication.class, args);
	}
}
