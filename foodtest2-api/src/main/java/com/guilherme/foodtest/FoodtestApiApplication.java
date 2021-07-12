package com.guilherme.foodtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.guilherme.foodtest.infrastructure.repository.CustomJpaRepositoryImpl;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = CustomJpaRepositoryImpl.class)
public class FoodtestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodtestApiApplication.class, args);
	}

}
