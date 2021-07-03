package com.guilherme.foodtest.domain.repository;

import java.util.List;

import com.guilherme.foodtest.domain.model.Cozinha;

public interface CozinhaRepository {
	
	List<Cozinha> listar();
	Cozinha buscar(Long id);
	List<Cozinha> consultarPorNome(String nome);
	
	Cozinha salvar(Cozinha cozinha);
	void remover (Long id);
	
}
