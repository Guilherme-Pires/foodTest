package com.guilherme.foodtest.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.guilherme.foodtest.FoodtestApiApplication;
import com.guilherme.foodtest.domain.model.Cozinha;
import com.guilherme.foodtest.domain.repository.CozinhaRepository;


public class InclusaoCozinhaMain {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(FoodtestApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);
		
		Cozinha cozinha1 = new Cozinha();
		cozinha1.setNome("Árabe");
		
		Cozinha cozinha2 = new Cozinha();
		cozinha2.setNome("Indiana");
	
		Cozinha cozinha3 = new Cozinha();
		cozinha3.setNome("Italiana");
		
		Cozinha cozinha4 = new Cozinha();
		cozinha1.setNome("Brasileira");
		
		cozinha1 = cozinhaRepository.salvar(cozinha1);
		cozinha2 = cozinhaRepository.salvar(cozinha2);
		cozinha3 = cozinhaRepository.salvar(cozinha3);
		cozinha4 = cozinhaRepository.salvar(cozinha4);
				
		System.out.printf("%d - %s\n", cozinha1.getId(), cozinha1.getNome());
		System.out.printf("%d - %s\n", cozinha2.getId(), cozinha2.getNome());
		System.out.printf("%d - %s\n", cozinha3.getId(), cozinha3.getNome());
		System.out.printf("%d - %s\n", cozinha4.getId(), cozinha4.getNome());
		
	}
}
