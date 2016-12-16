package es.crowdynamics.cook.services.recipe.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.crowdynamics.cook.dao.StepDAO;
import es.crowdynamics.cook.domain.Step;
import es.crowdynamics.cook.services.recipe.StepService;


@Service
public class StepServiceImpl implements StepService {
	
	@Autowired
	private StepDAO stepDAO;
	
	@Transactional(rollbackFor=Exception.class)
	public void findAndRemove(BigDecimal id){
		Step paso=stepDAO.find(id);
		stepDAO.delete(paso);
	}

	@Transactional(rollbackFor=Exception.class)
	public void update(Step paso) {
		stepDAO.update(paso);
	}
}
