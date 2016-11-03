package es.crowdynamics.cook.dao;

import java.math.BigDecimal;

import es.crowdynamics.cook.domain.Recipe;

public interface RecipeDAO {
	
	public void createRecipe(Recipe receta);
	public Recipe findByName(String name);
	public Recipe findById(BigDecimal id);
	public void deleteRecipe(Recipe receta);
	public void updateRecipe(Recipe receta);
}
