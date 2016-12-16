package es.crowdynamics.cook.dao;

import java.math.BigDecimal;
import java.util.List;

import es.crowdynamics.cook.domain.Step;

public interface StepDAO {
	
	public void create(Step paso);
	public Step find(String name);
	public Step find(BigDecimal id);
	public void delete(Step paso);
	public void update(Step paso);
	public List<Step> findAll();
}
