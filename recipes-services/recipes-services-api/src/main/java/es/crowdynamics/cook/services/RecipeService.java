package es.crowdynamics.cook.services;

import java.math.BigDecimal;

import es.crowdynamics.cook.services.types.Recipe;

public interface RecipeService {
	
	public void findAndRemove(BigDecimal id);
	public void update(Recipe receta);
}
