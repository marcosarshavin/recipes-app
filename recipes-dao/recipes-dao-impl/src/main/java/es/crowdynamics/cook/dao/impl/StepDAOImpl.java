package es.crowdynamics.cook.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import es.crowdynamics.cook.dao.StepDAO;
import es.crowdynamics.cook.domain.Step;

@Component
public class StepDAOImpl implements StepDAO	{
	
	@PersistenceContext
	private EntityManager entitymanager;

	
	@Transactional(rollbackFor=Exception.class)
	public void createStep(Step paso)	{
		
		this.entitymanager.persist(paso);
	}
	
	public Step findByName(String name)	{
		String query = "select o from Step o where o.name = :name";
		return this.entitymanager.createQuery(query, Step.class).setParameter("name", name).getSingleResult();
	}
	public  Step findById(BigDecimal id)	{
		return this.entitymanager.find(Step.class, id);
				
	}
	@Transactional(rollbackFor=Exception.class)
	public void deleteStep(Step paso)	{
		
		this.entitymanager.remove(paso);
	}
	@Transactional(rollbackFor=Exception.class)
	public void updateStep(Step paso)	{
		
		this.entitymanager.merge(paso);
	}

	@Override
	public List<Step> findAll()	{
		String query = "select o from Step o";
		return this.entitymanager.createQuery(query, Step.class).getResultList();
	}
}
