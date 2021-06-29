package com.guilherme.foodtest.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.guilherme.foodtest.domain.exception.EntidadeEmUsoException;
import com.guilherme.foodtest.domain.exception.EntidadeNaoEncontradaException;
import com.guilherme.foodtest.domain.model.Cidade;
import com.guilherme.foodtest.domain.model.Cozinha;
import com.guilherme.foodtest.domain.model.Estado;
import com.guilherme.foodtest.domain.model.Restaurante;
import com.guilherme.foodtest.domain.repository.CidadeRepository;
import com.guilherme.foodtest.domain.repository.CozinhaRepository;
import com.guilherme.foodtest.domain.repository.EstadoRepository;
import com.guilherme.foodtest.domain.repository.RestauranteRepository;

@Service
public class CadastroCidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;
    
    @Autowired
    private EstadoRepository estadoRepository;
    
    public Cidade salvar(Cidade cidade) {
        Long estadoId = cidade.getEstado().getId();
        Estado estado = estadoRepository.buscar(estadoId);
        
        if (estado == null) {
            throw new EntidadeNaoEncontradaException(
                String.format("Não existe cadastro de estado com código %d", estadoId));
        }
        
        cidade.setEstado(estado);
        
        return cidadeRepository.salvar(cidade);
    }
    
    public void excluir(Long cidadeId) {
        try {
            cidadeRepository.remover(cidadeId);
            
        } catch (EmptyResultDataAccessException e) {
            throw new EntidadeNaoEncontradaException(
                String.format("Não existe um cadastro de cidade com código %d", cidadeId));
        
        } catch (DataIntegrityViolationException e) {
            throw new EntidadeEmUsoException(
                String.format("Cidade de código %d não pode ser removida, pois está em uso", cidadeId));
        }
    }
    
}
