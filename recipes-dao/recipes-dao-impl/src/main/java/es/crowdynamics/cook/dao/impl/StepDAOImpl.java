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
public class StepDAOImpl extends  GenericDAO<Step, BigDecimal> implements StepDAO	{

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
}
