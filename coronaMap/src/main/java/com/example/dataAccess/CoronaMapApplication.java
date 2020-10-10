package com.example.dataAccess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CoronaMapApplication {
	
	

	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		SpringApplication.run(CoronaMapApplication.class, args);
		long fin = System.currentTimeMillis();
		System.out.println("Demora " + (double) (fin-inicio)/1000);
		
	}
}
