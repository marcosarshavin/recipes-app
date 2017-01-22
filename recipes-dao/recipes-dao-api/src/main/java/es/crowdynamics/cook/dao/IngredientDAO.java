package es.crowdynamics.cook.dao;

import java.math.BigDecimal;
import java.util.List;

import es.crowdynamics.cook.entity.IngredientEntity;

public interface IngredientDAO {
	
	public void create(IngredientEntity ingrediente);
	public IngredientEntity find(String name);
	public IngredientEntity find(BigDecimal id);
	public void delete(IngredientEntity ingrediente);
	public void update(IngredientEntity ingrediente);
	public List<IngredientEntity> findAll();
}
