package com.guilherme.foodtest.domain.repository;

import java.util.List;

import com.guilherme.foodtest.domain.model.Cozinha;

public interface CozinhaRepository {
	
	List<Cozinha> listar();
	Cozinha buscar(Long id);
	Cozinha salvar(Cozinha cozinha);
	void remover (Long id);
	
}
