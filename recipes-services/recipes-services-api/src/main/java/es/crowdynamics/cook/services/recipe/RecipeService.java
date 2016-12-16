package es.crowdynamics.cook.services.recipe;

import java.math.BigDecimal;

import es.crowdynamics.cook.domain.Recipe;

public interface RecipeService {
	
	public void findAndRemove(BigDecimal id);
	public void update(Recipe receta);
}
