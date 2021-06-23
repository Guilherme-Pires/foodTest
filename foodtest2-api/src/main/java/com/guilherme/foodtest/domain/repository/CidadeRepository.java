package com.guilherme.foodtest.domain.repository;

import java.util.List;

import com.guilherme.foodtest.domain.model.Cidade;

public interface CidadeRepository {
	
	List<Cidade> listar();
	Cidade buscar(Long id);
	Cidade salvar(Cidade cidade);
	void remover (Cidade cidade);
	
}
