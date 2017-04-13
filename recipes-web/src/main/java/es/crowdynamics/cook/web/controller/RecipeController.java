package es.crowdynamics.cook.web.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import es.crowdynamics.cook.dao.RecipeDAO;
import es.crowdynamics.cook.entity.RecipeEntity;
import es.crowdynamics.cook.services.RecipeService;
import es.crowdynamics.cook.services.types.Recipe;

@RestController
@RequestMapping(value = "/recipes")
public class RecipeController {
	
	@Autowired
	private RecipeDAO recipeDAO;
	
	@Autowired
	private RecipeService recipeService;
	
	@RequestMapping(value = "/findAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<RecipeEntity> findAllRecepies()	{

		return recipeDAO.findAll();
	}
	
	@RequestMapping(method= RequestMethod.POST)
	public ResponseEntity<String> create(@RequestBody Recipe receta)	{
		
		RecipeEntity recipeEntity = new RecipeEntity();
		recipeEntity.setName(receta.getName());

		recipeDAO.save(recipeEntity);
		
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

	//FIXME No se debe usar el DAO aqui
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody RecipeEntity find(@RequestParam BigDecimal id)	{

		RecipeEntity recipe = recipeDAO.findOne(id);
		
		return recipe;
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<String> delete(@RequestParam BigDecimal id)	{
		
		recipeService.findAndRemove(id);
		
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	@RequestMapping( method = RequestMethod.PUT)
	public ResponseEntity<String> update(@RequestBody Recipe receta){
		recipeService.update(receta);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	
}
