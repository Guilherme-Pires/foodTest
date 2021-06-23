package com.guilherme.foodtest.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.guilherme.foodtest.FoodtestApiApplication;
import com.guilherme.foodtest.domain.model.Permissao;
import com.guilherme.foodtest.domain.repository.PermissaoRepository;


public class ConsultaPermissaoMain {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(FoodtestApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		PermissaoRepository permissaoRepository = applicationContext.getBean(PermissaoRepository.class);
		
		List<Permissao> permissoes = permissaoRepository.listar();
        
        for (Permissao permissao : permissoes) {
            System.out.printf("%s - %s\n", permissao.getNome(), permissao.getDescricao());
		}
	}
}
