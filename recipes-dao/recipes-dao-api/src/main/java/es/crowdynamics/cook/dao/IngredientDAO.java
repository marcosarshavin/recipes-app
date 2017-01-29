package es.crowdynamics.cook.dao;

import java.math.BigDecimal;
import java.util.List;

import es.crowdynamics.cook.entity.IngredientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientDAO extends JpaRepository<IngredientEntity, BigDecimal>	{

/*
	public void create(IngredientEntity ingrediente);
	public IngredientEntity find(String name);
	public IngredientEntity find(BigDecimal id);
	public void delete(IngredientEntity ingrediente);
	public void update(IngredientEntity ingrediente);
	public List<IngredientEntity> findAll();
	*/
}
