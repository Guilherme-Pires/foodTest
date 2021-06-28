package com.guilherme.foodtest.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.guilherme.foodtest.domain.exception.EntidadeEmUsoException;
import com.guilherme.foodtest.domain.exception.EntidadeNaoEncontradaException;
import com.guilherme.foodtest.domain.model.Cozinha;
import com.guilherme.foodtest.domain.repository.CozinhaRepository;

@Service
public class CadastroRestauranteService {
	
	@Autowired
	private CozinhaRepository cozinhaRepository;
	
	public Cozinha salvar(Cozinha cozinha) {
		return cozinhaRepository.salvar(cozinha);
	}
	
	public void excluir(Long cozinhaId) {
		try {
			cozinhaRepository.remover(cozinhaId);
			
		} catch (EmptyResultDataAccessException e) {
			throw new EntidadeNaoEncontradaException(String.format("Não existe um cadastro de cozinha com o códifo %d", cozinhaId));
			
		} catch (DataIntegrityViolationException e) {
			throw new EntidadeEmUsoException(String.format("Cozinha de código %d não pode ser excluída pois está em uso.", cozinhaId));
		}
		
	}
	
}
