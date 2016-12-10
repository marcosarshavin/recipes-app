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
public class IngredientDAOImpl implements IngredientDAO	{
	
	@PersistenceContext
	private EntityManager entitymanager;

	
	@Transactional(rollbackFor=Exception.class)
	public void createIngredient(Ingredient ingrediente)	{
		
		this.entitymanager.persist(ingrediente);
	}
	
	public Ingredient findByName(String name)	{
		String query = "select o from Ingredient o where o.name = :name";
		return this.entitymanager.createQuery(query, Ingredient.class).setParameter("name", name).getSingleResult();
	}
	public  Ingredient findById(BigDecimal id)	{
		return this.entitymanager.find(Ingredient.class, id);
				
	}
	@Transactional(rollbackFor=Exception.class)
	public void deleteIngredient(Ingredient ingrediente)	{
		
		this.entitymanager.remove(ingrediente);
	}
	@Transactional(rollbackFor=Exception.class)
	public void updateIngredient(Ingredient ingrediente)	{
		
		this.entitymanager.merge(ingrediente);
	}

	@Override
	public List<Ingredient> findAll()	{
		String query = "select o from Ingredient o";
		return this.entitymanager.createQuery(query, Ingredient.class).getResultList();
	}
}
