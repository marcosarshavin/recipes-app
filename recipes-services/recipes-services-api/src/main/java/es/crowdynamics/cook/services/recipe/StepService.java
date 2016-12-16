package es.crowdynamics.cook.services.recipe;

import java.math.BigDecimal;

import es.crowdynamics.cook.domain.Step;

public interface StepService {
	
	public void findAndRemove(BigDecimal id);
	public void update(Step paso);
}
