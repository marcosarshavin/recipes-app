package es.crowdynamics.cook.services.Step.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.crowdynamics.cook.dao.StepDAO;
import es.crowdynamics.cook.domain.Step;
import es.crowdynamics.cook.services.Step.StepService;


@Service
public class StepServiceImpl implements StepService {
	
	@Autowired
	private StepDAO StepDAO;
	
	@Transactional(rollbackFor=Exception.class)
	public void findAndRemove(BigDecimal id){
		Step paso=StepDAO.findById(id);
		StepDAO.deleteStep(paso);
	}
	
	@Transactional(rollbackFor=Exception.class)
	public void updateStep (Step paso){
		StepDAO.updateStep(paso);
		
	}
}
