package com.example.companydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CompanyDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyDemoApplication.class, args);
	}

}


/**
 * Emp and Dept
 * Dept can have many employees
 * Employee can be in a single department

 */