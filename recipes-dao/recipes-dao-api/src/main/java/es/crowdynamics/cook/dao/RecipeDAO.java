package es.crowdynamics.cook.dao;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import es.crowdynamics.cook.entity.RecipeEntity;

public interface RecipeDAO extends JpaRepository<RecipeEntity, BigDecimal>	{
}
