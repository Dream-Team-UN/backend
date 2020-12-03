package com.example.dataAccess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;



@EnableTransactionManagement
@EnableJpaRepositories("com.example.dataAccess.repositories")
@SpringBootApplication
public class CoronaMapApplication {

	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(CoronaMapApplication.class, args);

	}

}
