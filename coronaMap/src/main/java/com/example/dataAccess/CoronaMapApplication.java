package com.example.dataAccess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.dataAccess.controllers.DateController;
import com.example.dataAccess.services.DateService;

@EnableTransactionManagement
@EnableJpaRepositories("com.example.dataAccess.repositories")
@SpringBootApplication
public class CoronaMapApplication {

	@Autowired
	public static void main(String[] args) {
		
		//System.out.println(dateService.weekCount().toString());
		/*System.out.println(dateController.countTwoWeek().toString());
		System.out.println(dateController.countMonth().toString());
		System.out.println(dateController.countTwoMonth().toString());
		*/
		SpringApplication.run(CoronaMapApplication.class, args);

	}

}
