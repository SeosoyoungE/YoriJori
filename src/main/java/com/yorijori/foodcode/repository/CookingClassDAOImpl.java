package com.yorijori.foodcode.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yorijori.foodcode.jpa.entity.CookingClass;
import com.yorijori.foodcode.jpa.entity.CookingClassContent;
import com.yorijori.foodcode.jpa.entity.CookingClassCurriculum;
import com.yorijori.foodcode.jpa.repository.CookingClassContentRepository;
import com.yorijori.foodcode.jpa.repository.CookingClassCurriculumRepository;
import com.yorijori.foodcode.jpa.repository.CookingClassRepository;

@Repository
public class CookingClassDAOImpl implements CookingClassDAO {
	CookingClassRepository classRepo;
	CookingClassContentRepository contentRepo;
	CookingClassCurriculumRepository curriculumRepo;
	
	@Autowired
	public CookingClassDAOImpl(CookingClassRepository classRepo, CookingClassContentRepository contentRepo,
			CookingClassCurriculumRepository curriculumRepo) {
		super();
		this.classRepo = classRepo;
		this.contentRepo = contentRepo;
		this.curriculumRepo = curriculumRepo;
	}

	@Override
	public void delete(int cookNo) {
		CookingClass cookingclass= classRepo.findById(cookNo).get();
		cookingclass.setCookNo(cookNo);
		cookingclass.setState(1);
		
	}

	@Override
	public List<CookingClass> selectAllClass() {
		return classRepo.findByState(0);
	}

	@Override
	public void updateClass(CookingClass cookingclass) {
		
	}

	@Override
	public void updateContent(CookingClassContent content) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCurriculum(CookingClassCurriculum curriculum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CookingClass readClass(int cookNo) {
		return classRepo.findById(cookNo).get();
	}

	@Override
	public CookingClassContent readContent(int cookNo) {
		return contentRepo.findById(cookNo).get();
	}

	@Override
	public CookingClassCurriculum readCurriculum(int cookNo) {
		return curriculumRepo.findById(cookNo).get();
	}


	@Override
	public void insertClass(CookingClass cookingclass) {
		classRepo.save(cookingclass);
	}


	@Override
	public void insertContent(CookingClassContent content) {
		contentRepo.save(content);
	}


	@Override
	public void insertCurriculum(CookingClassCurriculum curriculum) {
		curriculumRepo.save(curriculum);
	}


}
