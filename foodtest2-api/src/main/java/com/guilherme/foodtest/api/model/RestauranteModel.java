package com.guilherme.foodtest.api.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RestauranteModel {
	
	private Long id;
	private String nome;
	private BigDecimal frete;
	private CozinhaModel cozinha;
	private Boolean ativo;
	private EnderecoModel endereco;
	
}
