package es.crowdynamics.cook.dao;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import es.crowdynamics.cook.entity.IngredientTypeEntity;

public interface IngredientTypeDAO extends JpaRepository<IngredientTypeEntity, BigDecimal>	{
	
}
