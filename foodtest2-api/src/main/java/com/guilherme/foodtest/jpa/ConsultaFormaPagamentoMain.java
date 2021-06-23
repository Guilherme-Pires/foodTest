package com.guilherme.foodtest.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.guilherme.foodtest.FoodtestApiApplication;
import com.guilherme.foodtest.domain.model.FormaPagamento;
import com.guilherme.foodtest.domain.repository.FormaPagamentoRepository;


public class ConsultaFormaPagamentoMain {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(FoodtestApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		FormaPagamentoRepository formaPagamentoRepository = applicationContext.getBean(FormaPagamentoRepository.class);
		
		List<FormaPagamento> formasPagamentos = formaPagamentoRepository.listar();
		
		for (FormaPagamento formaPagamento : formasPagamentos) {
			System.out.println(formaPagamento.getDescricao());
		}
	}
}
