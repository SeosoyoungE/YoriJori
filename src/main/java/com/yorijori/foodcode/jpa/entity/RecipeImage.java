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
@Table(name="recipe_image")
@ToString(exclude = {"recipeNo"})
public class RecipeImage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; //컬렴명은 id
	//private int recipeNo;
	private int imgNo;
	private String oreImg;//원본 이미지 이름
	private String storeImg;// 저장할 이미지 이름
	private String content;
	
	@ManyToOne
	@JoinColumn(name = "recipeNo", nullable=false)
	private Recipe recipeNo;
}	
