package es.crowdynamics.cook.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import es.crowdynamics.cook.dao.StepDAO;
import es.crowdynamics.cook.domain.Recipe;
import es.crowdynamics.cook.domain.Step;

@Component
public abstract class StepDAOImpl extends  GenericDAO<Step, BigDecimal> implements StepDAO	{

	public Step find(String name)	{
		String query = "select o from Step o where o.name = :name";
		return this.entitymanager.createQuery(query, Step.class).setParameter("name", name).getSingleResult();
	}

	@Override
	protected String getTableName() {
		return "Step";
	}

	@Override
	protected Class<Step> getEntityClass() {
		return Step.class;
	}

	@Override
	@Transactional
	public void create(Step step) {
		entitymanager.persist(step);
	}

	@Override
	public Step find(BigDecimal id) {
		String query = "select o from Step o where o.id = :id";
	    return this.entitymanager.createQuery(query, Step.class).setParameter("id", id).getSingleResult();
	
	}

	@Override
	@Transactional
	public void delete(Step step) {
	// TODO Auto-generated method stub
		  entitymanager.remove(step);
		
	}
	@Transactional
	@Override
	public void update(Step step) {
			entitymanager.merge(step);
	}

	@Override
	public List<Step> findAll() {
		String query = "select o from Step o ";
	    return this.entitymanager.createQuery(query, Step.class).getResultList();
	
	
	}
}
