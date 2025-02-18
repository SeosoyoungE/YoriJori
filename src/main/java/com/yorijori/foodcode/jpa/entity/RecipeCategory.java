package com.yorijori.foodcode.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="recipe_category")
@ToString(exclude = {"recipeNo"})
public class RecipeCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; //컬럼명은 id
	//private int recipeNo;
	private int categoryNo;
	
	@ManyToOne
	@JoinColumn(name = "recipeNo", nullable=false)
	private Recipe recipeNo;
}
