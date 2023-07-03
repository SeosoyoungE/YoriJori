package com.yorijori.foodcode.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yorijori.foodcode.jpa.entity.SearchLog;
import com.yorijori.foodcode.repository.SearchLogDAO;

@Service
@Transactional
public class SearchLogServiceImpl implements SearchLogService {
	SearchLogDAO searchdao;

	@Autowired
	public SearchLogServiceImpl(SearchLogDAO searchdao) {
		super();
		this.searchdao = searchdao;
	}

	@Override
	public SearchLog findSearchLog(String keyword) {
		return searchdao.findSearchLog(keyword);
	}

	@Override
	public void insertLog(SearchLog searchlog) {
		SearchLog dto = null;
		dto = searchdao.findSearchLog(searchlog.getKeyword());
		if (dto == null) {
			searchdao.insertLog(searchlog);
		} else {
			searchdao.updateLog(searchlog);
		}
	}

	@Override
	public List<SearchLog> findTop10ByCount(){
		return searchdao.findTop10ByCount();
	}
}
