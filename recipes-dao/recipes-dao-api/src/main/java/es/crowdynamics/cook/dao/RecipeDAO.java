package es.crowdynamics.cook.dao;

import java.math.BigDecimal;
import java.util.List;

import es.crowdynamics.cook.domain.Recipe;

public interface RecipeDAO {
	
	public void create(Recipe receta);
	public Recipe find(String name);
	public Recipe find(BigDecimal id);
	public void delete(Recipe receta);
	public void update(Recipe receta);
	public List<Recipe> findAll();
}
