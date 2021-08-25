package com.guilherme.foodtest.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.guilherme.foodtest.domain.exception.RestauranteNaoEncontradoException;
import com.guilherme.foodtest.domain.model.Cidade;
import com.guilherme.foodtest.domain.model.Cozinha;
import com.guilherme.foodtest.domain.model.Restaurante;
import com.guilherme.foodtest.domain.repository.RestauranteRepository;

@Service
public class CadastroRestauranteService {

	@Autowired
	private RestauranteRepository restauranteRepository;
	
	@Autowired
	private CadastroCozinhaService cadastroCozinha;
	
	@Autowired
	private CadastroCidadeService cadastroCidade;
	
	@Transactional
	public Restaurante salvar(Restaurante restaurante) {
		Long cozinhaId = restaurante.getCozinha().getId();
		Long cidadeId = restaurante.getEndereco().getCidade().getId();

		Cozinha cozinha = cadastroCozinha.buscarOuFalhar(cozinhaId);
		Cidade cidade = cadastroCidade.buscarOuFalhar(cidadeId);
		
		restaurante.setCozinha(cozinha);
		restaurante.getEndereco().setCidade(cidade);
		
		return restauranteRepository.save(restaurante);
	}
	
	@Transactional
	public void ativar(Long restauranteId) {
		Restaurante restauranteAtual = buscarOuFalhar(restauranteId);
		
		restauranteAtual.ativar();
	}
	
	@Transactional
	public void inativar(Long restauranteId) {
		Restaurante restauranteAtual = buscarOuFalhar(restauranteId);
		
		restauranteAtual.inativar();
	}
	
	public Restaurante buscarOuFalhar(Long restauranteId) {
		return restauranteRepository.findById(restauranteId)
			.orElseThrow(() -> new RestauranteNaoEncontradoException(restauranteId));
	}
	
}