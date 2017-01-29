package es.crowdynamics.cook.dao;

import java.math.BigDecimal;
import java.util.List;

import es.crowdynamics.cook.entity.RecipeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeDAO extends JpaRepository<RecipeEntity, BigDecimal>	{
}
