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
@Table(name="RECETA_INGREDIENTE")
@SequenceGenerator(name = "id_recipeIngredient", sequenceName = "seq_recipeIngredient_id", allocationSize = 1, initialValue = 1)
public class RecipeIngredientEntity {
	@Id
	@GeneratedValue(generator="id_recipeIngredient",strategy=GenerationType.AUTO)
	@Column(name="id")
	private BigDecimal id;
	
	@Column(name="name")
	private String name;
	
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
	
}
