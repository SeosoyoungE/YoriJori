package com.yorijori.foodcode.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yorijori.foodcode.jpa.entity.ApiRecipe;
import com.yorijori.foodcode.jpa.entity.UserInfo;
import com.yorijori.foodcode.jpa.entity.UserWishListApi;
import com.yorijori.foodcode.repository.ApiRecipeDAO;

@Service
@Transactional
public class ApiRecipeServiceImpl implements ApiRecipeService {
	ApiRecipeDAO apiRecipeDAO;
	
	
	@Autowired
	public ApiRecipeServiceImpl(ApiRecipeDAO apiRecipeDAO) {
		super();
		this.apiRecipeDAO = apiRecipeDAO;
	}

	@Override
	public long countAll() {
		return apiRecipeDAO.countAll();
	}
	
	@Override
	public ApiRecipe selectByRcpSeq(int rcpSeq) {
		return apiRecipeDAO.selectByRcpSeq(rcpSeq);
	}
	
	@Override
	public List<ApiRecipe> getServerRecipe(int page, int pagePerCount){
		return apiRecipeDAO.selectListByPage(page, pagePerCount);
	}
	@Override
	public void wishList(UserInfo userinfo, ApiRecipe apirecipe) {
		long count = apiRecipeDAO.countByRcpSeqByWishList(apirecipe);
		UserWishListApi userwishlistapi = new UserWishListApi();
		userwishlistapi.setRcpSeq(apirecipe);
		userwishlistapi.setUserId(userinfo);
		if (count > 0 ) {
			apiRecipeDAO.deleteWishList(apirecipe);
		} else {
			apiRecipeDAO.addWishList(userwishlistapi);
		}
	}
}
