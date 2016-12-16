package es.crowdynamics.cook.services.recipe;

import java.math.BigDecimal;

import es.crowdynamics.cook.domain.Ingredient;

public interface IngredientService {
	
	public void findAndRemove(BigDecimal id);
	public void updateingredient(Ingredient ingrediente);
}
