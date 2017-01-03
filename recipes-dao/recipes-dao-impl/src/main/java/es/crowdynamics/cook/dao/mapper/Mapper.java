package es.crowdynamics.cook.dao.mapper;

import es.crowdynamics.cook.domain.Ingredient;
import es.crowdynamics.cook.entity.IngredientEntity;

public class Mapper {
	public static IngredientEntity mappEntity(Ingredient ingrediente){
		//mapear un objeto entity getters y setters
		IngredientEntity IE=new IngredientEntity();
		IE.setId(ingrediente.getId());
		IE.setName(ingrediente.getName());
		
		return IE;
	}
	
	
	
	
	}