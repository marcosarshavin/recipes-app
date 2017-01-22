package es.crowdynamics.cook.dao.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import es.crowdynamics.cook.dao.RecipeDAO;
import es.crowdynamics.cook.entity.RecipeEntity;

@Component
public class RecipeDAOImpl extends GenericDAO<RecipeEntity, BigDecimal> implements RecipeDAO	{

	@Override
	public RecipeEntity find(String name) {
		String query = "select o from RecipeEntity o where o.name = :name";
		return this.entitymanager.createQuery(query, RecipeEntity.class).setParameter("name", name).getSingleResult();
	}

	@Override
	protected String getTableName() {
		return "RecipeEntity";
	}

	@Override
	protected Class<RecipeEntity> getEntityClass() {
		return RecipeEntity.class;
	}
}
