package com.guilherme.foodtest.api.model.mixin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.guilherme.foodtest.domain.model.Estado;

public abstract class CidadeMixin {

	@JsonIgnoreProperties(value = "nome", allowGetters = true)
	private Estado estado;
	
}
