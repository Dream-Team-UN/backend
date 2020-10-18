package com.example.dataAccess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dataAccess.repositories.CaseRepository;


@SpringBootApplication
public class CoronaMapApplication {
	
	

	public static void main(String[] args) {
		CaseRepository repo = new CaseRepository();
		long inicio = System.currentTimeMillis();
		SpringApplication.run(CoronaMapApplication.class, args);
		System.out.println("Casos totales " + repo.totalCases());
		System.out.println("muertos totales " + repo.totalDied());
		System.out.println("recuperados totales " + repo.totalRecupered());
		System.out.println("infectados actuales totales " + repo.actualInfected());
		System.out.println("infectados de nariño " + repo.totalCasesdepar("Nariño"));
		System.out.println("muertos de nariño " + repo.totalDiedepar("Nariño"));
		System.out.println("recuperados de nariño " + repo.totalRecuperedepar("Nariño"));
		System.out.println("casos activos de nariño " + repo.actualInfectedepar("Nariño"));
		long fin = System.currentTimeMillis();
		System.out.println("Demora " + (double) (fin-inicio)/1000);
	
		
	}
}
