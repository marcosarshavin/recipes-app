package es.crowdynamics.cook.dao;

import java.math.BigDecimal;
import java.util.List;

import es.crowdynamics.cook.entity.RecipeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeDAO extends JpaRepository<RecipeEntity, BigDecimal>	{
	/*
	public void create(RecipeEntity receta);
	public RecipeEntity find(String name);
	public RecipeEntity find(BigDecimal id);
	public void delete(RecipeEntity receta);
	public void update(RecipeEntity receta);
	public List<RecipeEntity> findAll();
	*/
}
