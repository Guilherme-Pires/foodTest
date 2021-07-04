package com.guilherme.foodtest.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guilherme.foodtest.domain.model.Cozinha;

@Repository
public interface CozinhaRepository extends JpaRepository<Cozinha, Long> {
	
//	List<Cozinha> consultarPorNome(String nome);
	
	
	
}
