package com.guilherme.foodtest.core.jackson;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.module.SimpleModule;
import com.guilherme.foodtest.api.model.mixin.CidadeMixin;
import com.guilherme.foodtest.api.model.mixin.CozinhaMixin;
import com.guilherme.foodtest.api.model.mixin.RestauranteMixin;
import com.guilherme.foodtest.domain.model.Cidade;
import com.guilherme.foodtest.domain.model.Cozinha;
import com.guilherme.foodtest.domain.model.Restaurante;

@Component
public class JacksonMixinModule extends SimpleModule {

	private static final long serialVersionUID = 1L;
	
	public JacksonMixinModule() {
	    setMixInAnnotation(Restaurante.class, RestauranteMixin.class);
	    setMixInAnnotation(Cidade.class, CidadeMixin.class);
	    setMixInAnnotation(Cozinha.class, CozinhaMixin.class);
	}
	
	
	
	
}
