package es.crowdynamics.cook.services;

import java.math.BigDecimal;

import es.crowdynamics.cook.services.types.Step;

public interface StepService {
	
	public void findAndRemove(BigDecimal id);
	public void update(Step paso);
}
