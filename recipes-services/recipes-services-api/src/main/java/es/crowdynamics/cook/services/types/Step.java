package es.crowdynamics.cook.services.types;

import java.math.BigDecimal;

public class Step {

	private BigDecimal id;

	private String name;

	// Identificador del ingrediente a usar en el paso
	private BigDecimal idIngredient;

	public BigDecimal getIdIngredient() {
		return idIngredient;
	}

	public void setIdIngredient(BigDecimal idIngredient) {
		this.idIngredient = idIngredient;
	}

	public Long getStepCookingTime() {
		return stepCookingTime;
	}

	public void setStepCookingTime(Long stepCookingTime) {
		this.stepCookingTime = stepCookingTime;
	}

	// Cantidad del ingrediente a emplear en el paso
	private BigDecimal quantity;

	// Tiempo de preparación en segundos
	private Long stepCookingTime;

	// Descripcion mas detallada del paso
	private String description;

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCookingTime() {
		return stepCookingTime;
	}

	public void setCookingTime(Long stepCookingTime) {
		this.stepCookingTime = stepCookingTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
