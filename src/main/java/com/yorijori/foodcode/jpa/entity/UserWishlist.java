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
@Table(name="user_wishlist")
@ToString(exclude = {"userId","recipeNo"})
public class UserWishlist {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; //컬럼명 id / autoincrement
	
	@ManyToOne
	@JoinColumn(name = "userId", nullable=false)
	private UserInfo userId;
	
	@ManyToOne
	@JoinColumn(name = "recipeNo", nullable=false)
	private Recipe recipeNo;
}
