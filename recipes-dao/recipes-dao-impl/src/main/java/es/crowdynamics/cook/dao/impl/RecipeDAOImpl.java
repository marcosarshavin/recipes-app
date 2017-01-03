package es.crowdynamics.cook.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import es.crowdynamics.cook.dao.RecipeDAO;
import es.crowdynamics.cook.domain.Recipe;

@Component
public abstract class RecipeDAOImpl extends GenericDAO<Recipe, BigDecimal> implements RecipeDAO	{
	
	public Recipe find(String name)	{
		String query = "select o from Recipe o where o.name = :name";
		return this.entitymanager.createQuery(query, Recipe.class).setParameter("name", name).getSingleResult();
	}

	@Override
	protected String getTableName() {
		return "Recipe";
	}

	@Override
	protected Class<Recipe> getEntityClass() {
		return Recipe.class;
	}

	@Override
	public void create(Recipe receta) {
		
	}

	@Override
	public Recipe find(BigDecimal id) {
		String query = "select o from Recipe o where o.id = :id";
	    return this.entitymanager.createQuery(query, Recipe.class).setParameter("id", id).getSingleResult();
	
	}

	@Override
	public void delete(Recipe receta) {
	// TODO Auto-generated method stub
	//	  entitymanager.find(receta.class, 1);
		  entitymanager.getTransaction().begin();
		  entitymanager.remove(receta);
		  entitymanager.getTransaction().commit();
		
	}

	@Override
	public void update(Recipe receta) {
			
	}

	@Override
	public List<Recipe> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
