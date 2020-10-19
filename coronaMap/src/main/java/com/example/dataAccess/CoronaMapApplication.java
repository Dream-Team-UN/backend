package com.example.dataAccess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.dataAccess.repositories.CaseRepository;


@EnableTransactionManagement
@EnableJpaRepositories("com.example.dataAccess.repositories")
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
		System.out.println("asintomaticos totales " + repo.totalAsintomatics());
		long fin = System.currentTimeMillis();
		System.out.println("Demora " + (double) (fin-inicio)/1000);
		
	}
	
}
