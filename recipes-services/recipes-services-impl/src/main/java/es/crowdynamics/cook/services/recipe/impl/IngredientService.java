package es.crowdynamics.cook.services.Ingredient.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.crowdynamics.cook.dao.IngredientDAO;
import es.crowdynamics.cook.domain.Ingredient;
import es.crowdynamics.cook.services.Ingredient.IngredientService;


@Service
public class IngredientServiceImpl implements IngredientService {
	
	@Autowired
	private IngredientDAO IngredientDAO;
	
	@Transactional(rollbackFor=Exception.class)
	public void findAndRemove(BigDecimal id){
		Ingredient ingrediente=IngredientDAO.findById(id);
		IngredientDAO.deleteIngredient(ingrediente);
	}
	
	@Transactional(rollbackFor=Exception.class)
	public void updateIngredient (Ingredient ingrediente){
		IngredientDAO.updateIngredient(ingrediente);
		
	}
}
