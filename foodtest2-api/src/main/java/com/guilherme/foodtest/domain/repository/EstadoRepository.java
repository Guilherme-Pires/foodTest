package com.guilherme.foodtest.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guilherme.foodtest.domain.model.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long>{
			
}
