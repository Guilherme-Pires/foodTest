package com.guilherme.foodtest.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.guilherme.foodtest.FoodtestApiApplication;
import com.guilherme.foodtest.domain.model.Cidade;
import com.guilherme.foodtest.domain.repository.CidadeRepository;



public class ConsultaCidadeMain {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(FoodtestApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CidadeRepository cidadeRepository = applicationContext.getBean(CidadeRepository.class);
		
		List<Cidade> cidades = cidadeRepository.listar();
		
		for (Cidade cidade : cidades) {
			System.out.println(cidade.getNome());
		}
	}
}
