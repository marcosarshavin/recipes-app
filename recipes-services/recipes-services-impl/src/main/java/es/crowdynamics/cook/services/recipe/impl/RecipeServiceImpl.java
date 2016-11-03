package es.crowdynamics.cook.services.recipe.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.crowdynamics.cook.dao.RecipeDAO;
import es.crowdynamics.cook.domain.Recipe;
import es.crowdynamics.cook.services.recipe.RecipeService;


@Service
public class RecipeServiceImpl implements RecipeService {
	
	@Autowired
	private RecipeDAO recipeDAO;
	
	@Transactional(rollbackFor=Exception.class)
	public void findAndRemove(BigDecimal id){
		Recipe receta=recipeDAO.findById(id);
		recipeDAO.deleteRecipe(receta);
	}
	
	@Transactional(rollbackFor=Exception.class)
	public void updaterecipe (Recipe receta){
		recipeDAO.updateRecipe(receta);
		
	}
}
