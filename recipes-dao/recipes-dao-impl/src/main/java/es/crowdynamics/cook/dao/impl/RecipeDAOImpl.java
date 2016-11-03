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
public class RecipeDAOImpl implements RecipeDAO	{
	
	@PersistenceContext
	private EntityManager entitymanager;

	
	@Transactional(rollbackFor=Exception.class)
	public void createRecipe(Recipe receta)	{
		
		this.entitymanager.persist(receta);
	}
	
	public Recipe findByName(String name)	{
		String query = "select o from Recipe o where o.name = :name";
		return this.entitymanager.createQuery(query, Recipe.class).setParameter("name", name).getSingleResult();
	}
	public  Recipe findById(BigDecimal id)	{
		return this.entitymanager.find(Recipe.class, id);
				
	}
	@Transactional(rollbackFor=Exception.class)
	public void deleteRecipe(Recipe receta)	{
		
		this.entitymanager.remove(receta);
	}
	@Transactional(rollbackFor=Exception.class)
	public void updateRecipe(Recipe receta)	{
		
		this.entitymanager.merge(receta);
	}

	@Override
	public List<Recipe> findAll()	{
		String query = "select o from Recipe o";
		return this.entitymanager.createQuery(query, Recipe.class).getResultList();
	}
}
