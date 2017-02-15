package es.crowdynamics.cook.dao;

import java.math.BigDecimal;
import java.util.List;

import es.crowdynamics.cook.entity.IngredientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientTypeDAO extends JpaRepository<IngredientTypeEntity, BigDecimal>	{
}
