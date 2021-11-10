package com.guilherme.foodtest.domain.service;

import com.guilherme.foodtest.domain.filter.VendaDiariaFilter;

public interface VendaReportService {
	
	byte[] emitirVendasDiarias(VendaDiariaFilter filtro, String timeOffSet);
	
}
