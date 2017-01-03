
package es.crowdynamics.cook.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Component;

import es.crowdynamics.cook.dao.IngredientDAO;
import es.crowdynamics.cook.domain.Ingredient;
import es.crowdynamics.cook.entity.IngredientEntity;

@Component
public abstract class IngredientDAOImpl extends GenericDAO<IngredientEntity, BigDecimal> implements IngredientDAO	{

	public Ingredient find(String name)	{
		String query = "select o from Ingredient o where o.name = :name";
		return this.entitymanager.createQuery(query, Ingredient.class).setParameter("name", name).getSingleResult();
	}

	@Override
	protected String getTableName() {
		return "Ingredient";
	}

	@Override
	protected Class<IngredientEntity> getEntityClass() {
		return IngredientEntity.class;
	}

	@Override
	public void create(Ingredient ingrediente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Ingredient find(BigDecimal id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Ingredient ingrediente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Ingredient ingrediente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Ingredient> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
