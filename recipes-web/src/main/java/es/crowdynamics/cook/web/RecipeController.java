package es.crowdynamics.cook.web;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import es.crowdynamics.cook.dao.RecipeDAO;
import es.crowdynamics.cook.domain.Recipe;
import es.crowdynamics.cook.services.recipe.RecipeService;

@RestController
@RequestMapping(value = "/recipes")
public class RecipeController {
	
	@Autowired
	private RecipeDAO recipeDAO;
	
	@Autowired
	private RecipeService recipeService;
	
	@RequestMapping(value = "/findAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Recipe> findAllRecepies()	{

		return recipeDAO.findAll();
	}
	
	@RequestMapping(method= RequestMethod.POST)
	public ResponseEntity<String> createRecipe(@RequestBody Recipe receta)	{
		
		recipeDAO.createRecipe(receta);
		
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Recipe findRecipe(@RequestParam BigDecimal id)	{
		
		Recipe recipe = recipeDAO.findById(id);
		
		return recipe;
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteRecipe(@RequestParam BigDecimal id)	{
		
		recipeService.findAndRemove(id);
		
		return new ResponseEntity<String>(HttpStatus.OK);
		}
	
	@RequestMapping( method = RequestMethod.PUT)
	public ResponseEntity<String> updateRecipe (@RequestBody Recipe receta){
		recipeService.updaterecipe(receta);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	
}
