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
@Table(name="RECETA")
@SequenceGenerator(name = "id_recipe", sequenceName = "seq_recipe_id", allocationSize = 1, initialValue = 1)
public class RecipeEntity {

	@Id
	@GeneratedValue(generator="id_recipe",strategy=GenerationType.AUTO)
	@Column(name="id")
	private BigDecimal id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	
	@Column(name="comensales")
	private Long comensales;// Cambiar todas las referencias a nPersonas por comensales.
	
	@Column(name="likes")
	private BigDecimal likes;
	
	@Column(name="photo")
	private String photo;
	
		
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
	public Long getComensales() {
		return comensales;
	}
	public void setComensales(Long comensales) {
		this.comensales = comensales;
	}
	public BigDecimal getLikes() {
		return likes;
	}
	public void setLikes(BigDecimal likes) {
		this.likes = likes;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	
	
	
}
