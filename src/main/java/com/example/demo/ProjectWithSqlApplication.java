package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.example.demo.dao")
@SpringBootApplication
@EntityScan("com.example.demo.model")
public class ProjectWithSqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectWithSqlApplication.class, args);
	}

}
