package es.crowdynamics.cook.services.types;

import java.math.BigDecimal;

public class Recipe {

	private BigDecimal id;
	
	private String name;
	

	private Long nPersonas;
	
	//Tiempo de preparación en segundos
	private Long cookingTime;
	
	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getnPersonas() {
		return nPersonas;
	}
	public void setnPersonas(Long nPersonas) {
		this.nPersonas = nPersonas;
	}
	public Long getCookingTime() {
		return cookingTime;
	}
	public void setCookingTime(Long cookingTime) {
		this.cookingTime = cookingTime;
	}
	
}
