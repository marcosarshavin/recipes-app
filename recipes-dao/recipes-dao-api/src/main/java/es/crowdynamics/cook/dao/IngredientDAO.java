package es.crowdynamics.cook.dao;

import java.math.BigDecimal;
import java.util.List;

import es.crowdynamics.cook.domain.Ingredient;

public interface IngredientDAO {
	
	public void createIngredient(Ingredient ingrediente);
	public Ingredient findByName(String name);
	public Ingredient findById(BigDecimal id);
	public void deleteIngredient(Ingredient ingrediente);
	public void updateIngredient(Ingredient ingrediente);
	public List<Ingredient> findAll();
}
