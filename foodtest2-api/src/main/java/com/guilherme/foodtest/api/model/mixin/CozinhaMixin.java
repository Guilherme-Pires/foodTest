package com.guilherme.foodtest.api.model.mixin;

import java.util.List;

import com.guilherme.foodtest.domain.model.Restaurante;
import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class CozinhaMixin {

	@JsonIgnore
	private List<Restaurante> restaurantes;
	
}
