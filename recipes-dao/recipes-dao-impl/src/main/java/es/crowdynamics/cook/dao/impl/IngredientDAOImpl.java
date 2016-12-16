package es.crowdynamics.cook.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import es.crowdynamics.cook.dao.IngredientDAO;
import es.crowdynamics.cook.domain.Ingredient;

@Component
public class IngredientDAOImpl extends GenericDAO<Ingredient, BigDecimal> implements IngredientDAO	{

	public Ingredient find(String name)	{
		String query = "select o from Ingredient o where o.name = :name";
		return this.entitymanager.createQuery(query, Ingredient.class).setParameter("name", name).getSingleResult();
	}

	@Override
	protected String getTableName() {
		return "Ingredient";
	}

	@Override
	protected Class<Ingredient> getEntityClass() {
		return Ingredient.class;
	}
}
