package com.guilherme.foodtest.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.guilherme.foodtest.FoodtestApiApplication;
import com.guilherme.foodtest.domain.model.Cozinha;
import com.guilherme.foodtest.domain.repository.CozinhaRepository;


public class ExclusaoCozinhaMain {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(FoodtestApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);
		
		Cozinha cozinha = new Cozinha();
		cozinha.setId(1L);
						
		cozinhaRepository.remover(cozinha);
		
	}
}
