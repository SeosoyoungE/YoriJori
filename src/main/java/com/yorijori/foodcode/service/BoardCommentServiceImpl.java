package com.yorijori.foodcode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yorijori.foodcode.jpa.entity.BoardComment;
import com.yorijori.foodcode.repository.BoardCommentDAO;
@Transactional
@Service
public class BoardCommentServiceImpl implements BoardCommentService {
	BoardCommentDAO dao;
	
	@Autowired
	public BoardCommentServiceImpl(BoardCommentDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public BoardComment insert(BoardComment boardComment) {
		return dao.insert(boardComment);
	}

	@Override
	public List<BoardComment> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public int update(BoardComment boardComment) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(BoardComment boardComment) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long countAll() {
		return dao.countAll();
	}

	@Override
	public List<BoardComment> selectComment(int commNo) {
		
		return dao.selectComment(commNo);
	}



}
