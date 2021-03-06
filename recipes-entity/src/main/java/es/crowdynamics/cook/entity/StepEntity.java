package es.crowdynamics.cook.entity;


import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PASO")
@SequenceGenerator(name = "id_step", sequenceName = "seq_step_id", allocationSize = 1, initialValue = 1)
public class StepEntity {

	@Id
	@GeneratedValue(generator="id_step",strategy=GenerationType.AUTO)
	@Column(name="id")
	private BigDecimal id;
	
	
	@Column(name="name")
	private String name;
	
	//Identificador del ingrediente a usar en el paso
	@Column(name="idIngredient")
	private BigDecimal idIngredient;

	//Identificador del ingrediente a usar en el paso
	@Column(name="idRecipe")
	private BigDecimal idRecipe;
	
	//Cantidad del ingrediente a emplear en el paso
	@Column(name="quantity")
	private BigDecimal quantity;
	
	//Tiempo de preparación en segundos
	@Column(name="STEP_COOKING_TIME")
	private Long stepCookingTime;
	
	//Descripcion mas detallada del paso
	@Column(name="description")
	private String description;
		
	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
	}
	
	public BigDecimal getIdRecipe() {
		return idRecipe;
	}
	public void setIdRecipe(BigDecimal idRecipe) {
		this.idRecipe = idRecipe;
	}
	public BigDecimal getIdIngredient() {
		return idIngredient;
	}
	public void setIdIngredient(BigDecimal idIngredient) {
		this.idIngredient = idIngredient;
	}
	

	
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity =quantity;
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
