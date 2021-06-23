package com.guilherme.foodtest.domain.repository;

import java.util.List;

import com.guilherme.foodtest.domain.model.Estado;

public interface EstadoRepository {
	
	List<Estado> listar();
	Estado buscar(Long id);
	Estado salvar(Estado estado);
	void remover (Estado estado);
	
}
