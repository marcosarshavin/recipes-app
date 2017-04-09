package es.crowdynamics.cook.services;

import java.math.BigDecimal;

import es.crowdynamics.cook.services.types.Ingredient;

public interface IngredientService {
	
	public void findAndRemove(BigDecimal id);
	public void update(Ingredient ingrediente);
}
