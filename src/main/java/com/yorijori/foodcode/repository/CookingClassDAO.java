package com.yorijori.foodcode.repository;

import java.util.List;

import com.yorijori.foodcode.jpa.entity.CookingClass;
import com.yorijori.foodcode.jpa.entity.CookingClassContent;
import com.yorijori.foodcode.jpa.entity.CookingClassCurriculum;

public interface CookingClassDAO {
	public void insertClass(CookingClass cookingclass);
	public void insertContent(CookingClassContent content);
	public void insertCurriculum(CookingClassCurriculum curriculum);
	public void delete(int cookNo);
	public void updateClass(CookingClass cookingclass);
	public void updateContent(CookingClassContent content);
	public void updateCurriculum(CookingClassCurriculum curriculum);
	public List<CookingClass> selectAllClass();
	public CookingClass readClass(int cookNo);
	public CookingClassContent readContent(int cookNo);
	public CookingClassCurriculum readCurriculum(int cookNo);
}
