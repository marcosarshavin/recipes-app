
package es.crowdynamics.cook.dao.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import es.crowdynamics.cook.dao.IngredientDAO;
import es.crowdynamics.cook.entity.IngredientEntity;

@Component
public class IngredientDAOImpl extends GenericDAO<IngredientEntity, BigDecimal> implements IngredientDAO	{

	@Override
	public IngredientEntity find(String name)	{
		String query = "select o from IngredientEntity o where o.name = :name";
		return this.entitymanager.createQuery(query, IngredientEntity.class).setParameter("name", name).getSingleResult();
	}

	@Override
	protected String getTableName() {
		return "IngredientEntity";
	}

	@Override
	protected Class<IngredientEntity> getEntityClass() {
		return IngredientEntity.class;
	}
}
