package es.crowdynamics.cook.dao.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import es.crowdynamics.cook.dao.StepDAO;
import es.crowdynamics.cook.entity.StepEntity;

@Component
public class StepDAOImpl extends  GenericDAO<StepEntity, BigDecimal> implements StepDAO	{

	@Override
	public StepEntity find(String name)	{
		String query = "select o from StepEntity o where o.name = :name";
		return this.entitymanager.createQuery(query, StepEntity.class).setParameter("name", name).getSingleResult();
	}

	@Override
	protected String getTableName() {
		return "StepEntity";
	}

	@Override
	protected Class<StepEntity> getEntityClass() {
		return StepEntity.class;
	}
}
