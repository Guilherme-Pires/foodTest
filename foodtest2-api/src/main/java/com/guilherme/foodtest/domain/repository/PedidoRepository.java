package com.guilherme.foodtest.domain.repository;

import org.springframework.stereotype.Repository;

import com.guilherme.foodtest.domain.model.Pedido;

@Repository
public interface PedidoRepository extends CustomJpaRepository<Pedido, Long> {

}
