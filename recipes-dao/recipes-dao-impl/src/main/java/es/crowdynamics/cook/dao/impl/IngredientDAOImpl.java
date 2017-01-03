
package es.crowdynamics.cook.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import es.crowdynamics.cook.dao.IngredientDAO;
import es.crowdynamics.cook.domain.Ingredient;
import es.crowdynamics.cook.domain.Recipe;
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
	@Transactional
	public void create(Ingredient ingrediente) {
		entitymanager.persist(ingrediente);
	}

	@Override
	public Ingredient find(BigDecimal id) {
		String query = "select o from Ingredient o where o.id = :id";
	    return this.entitymanager.createQuery(query, Ingredient.class).setParameter("id", id).getSingleResult();
	
	}

	@Override
	@Transactional
	public void delete(Ingredient ingrediente) {
	// TODO Auto-generated method stub
		  entitymanager.remove(ingrediente);
		
	}
	@Transactional
	@Override
	public void update(Ingredient ingrediente) {
			entitymanager.merge(ingrediente);
	}

	@Override
	public List<Ingredient> findAll() {
		String query = "select o from Ingredient o ";
	    return this.entitymanager.createQuery(query, Ingredient.class).getResultList();
	
	
	}
}
