package com.guilherme.foodtest.domain.service;

import java.util.List;

import com.guilherme.foodtest.domain.filter.VendaDiariaFilter;
import com.guilherme.foodtest.domain.model.dto.VendaDiaria;

public interface VendaQueryService {
	
	List<VendaDiaria> consultarVendasDiarias(VendaDiariaFilter filro);
	
}
