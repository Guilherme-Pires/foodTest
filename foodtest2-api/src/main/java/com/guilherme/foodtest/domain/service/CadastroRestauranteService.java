package com.guilherme.foodtest.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.guilherme.foodtest.domain.exception.EntidadeEmUsoException;
import com.guilherme.foodtest.domain.exception.EntidadeNaoEncontradaException;
import com.guilherme.foodtest.domain.model.Cozinha;
import com.guilherme.foodtest.domain.model.Restaurante;
import com.guilherme.foodtest.domain.repository.CozinhaRepository;
import com.guilherme.foodtest.domain.repository.RestauranteRepository;

@Service
public class CadastroRestauranteService {
	
	@Autowired
	private RestauranteRepository restauranteRepository;
	
	@Autowired
	private CozinhaRepository cozinhaRepository;
	
	public Restaurante salvar(Restaurante restaurante) {
		Long cozinhaId = restaurante.getCozinha().getId();
		Cozinha cozinha = cozinhaRepository.buscar(cozinhaId);
		
		if (cozinha == null) {
			throw new EntidadeNaoEncontradaException(String.format("Não existe cadastro de cozinha com código %d", cozinhaId));
		}
		
		restaurante.setCozinha(cozinha);
		
		return restauranteRepository.salvar(restaurante);
	}
	
//	public void excluir(Long restauranteId) {
//		try {
//			restauranteRepository.remover(restauranteId);
//			
//		} catch (EmptyResultDataAccessException e) {
//			throw new EntidadeNaoEncontradaException(String.format("Não existe um cadastro de cozinha com o código %d", restauranteId));
//			
//		} catch (DataIntegrityViolationException e) {
//			throw new EntidadeEmUsoException(String.format("Cozinha de código %d não pode ser excluída pois está em uso.", restauranteId));
//		}
//		
//	}
	
}
