package es.crowdynamics.cook.dao;

import java.math.BigDecimal;
import java.util.List;

import es.crowdynamics.cook.domain.Recipe;

public interface StepDAO {
	
	public void createStep(Step paso);
	public Step findByName(String name);
	public Step findById(BigDecimal id);
	public void deleteStep(Step paso);
	public void updateStep(Step paso);
	public List<Step> findAll();
}
