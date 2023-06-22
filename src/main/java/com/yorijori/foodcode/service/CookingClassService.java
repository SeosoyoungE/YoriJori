package com.yorijori.foodcode.service;

import java.util.List;

import com.yorijori.foodcode.jpa.entity.CookingClass;
import com.yorijori.foodcode.jpa.entity.CookingClassContent;
import com.yorijori.foodcode.jpa.entity.CookingClassCurriculum;
import com.yorijori.foodcode.jpa.entity.CookingClassImage;

public interface CookingClassService {
	public void insert(CookingClass cookingclass); //파라미터 추가
	public void delete(int cookNo); //파라미터 추가
	public void update(CookingClass cookingclass,CookingClassContent content,CookingClassCurriculum curriculum);
	public List<CookingClass> selectAllClass();
	public CookingClass readClass(int cookNo);
	public List<CookingClassContent> readContent(int cookNo);
	public List<CookingClassCurriculum> readCurriculum(int cookNo);
	public void insertImage(CookingClassImage image);
}
