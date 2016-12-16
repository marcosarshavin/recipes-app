package es.crowdynamics.cook.dao;

import java.math.BigDecimal;
import java.util.List;

import es.crowdynamics.cook.domain.Ingredient;

public interface IngredientDAO {
	
	public void create(Ingredient ingrediente);
	public Ingredient find(String name);
	public Ingredient find(BigDecimal id);
	public void delete(Ingredient ingrediente);
	public void update(Ingredient ingrediente);
	public List<Ingredient> findAll();
}
