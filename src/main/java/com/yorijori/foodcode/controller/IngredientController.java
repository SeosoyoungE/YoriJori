package com.yorijori.foodcode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yorijori.foodcode.jpa.entity.Ingredients;
import com.yorijori.foodcode.service.IngredientService;

@Controller
@RequestMapping("ingredient")
public class IngredientController {
	IngredientService ingredientService;
	
	@Autowired
	public IngredientController(IngredientService ingredientService) {
		super();
		this.ingredientService = ingredientService;
	}
	

	@RequestMapping("/list/{page}/{category}")
	public String getListByCategory(@PathVariable int page, @PathVariable String category,Model model) {
		long count = ingredientService.countAll();
		List<Ingredients> list = ingredientService.selectByPage(page, category);
		model.addAttribute("page", page);
		if (category.equals("all")) {
			model.addAttribute("count", count);
		} else {
			model.addAttribute("count", list.size());
		}
		model.addAttribute("list", list);
		model.addAttribute("category", category);
		return "thymeleaf/recipe/ingredient";
	}
	
	@RequestMapping("/list/{page}/{category}/{searchData}")
	public String getListByCategory(@PathVariable int page,@PathVariable String category, @PathVariable String searchData, Model model) {
		List<Ingredients> list = ingredientService.selectBySearch(page, category, searchData, 12);
		model.addAttribute("page", page);
		model.addAttribute("count", list.size());
		model.addAttribute("list", list);
		model.addAttribute("category", category);
		model.addAttribute("searchData", searchData);
		
		return "thymeleaf/recipe/ingredient";
	}

	@PostMapping("/getListByPage")
	@ResponseBody
	public List<Ingredients> getListByPage(int page, int pagePerCount) {
		List<Ingredients> list = ingredientService.selectByPagePerCount(page, pagePerCount);
		return list;
	}
	
    @PostMapping("/getListBySearchData")
	@ResponseBody
	public List<Ingredients> getListByPageAndSearchData(int page, int pagePerCount,String searchData) {
		List<Ingredients> list = ingredientService.selectBySearch(page, "all", searchData, pagePerCount);
		return list;
	}
	@PostMapping("/getListCount")
	@ResponseBody
	public long getListByPage(String searchData) {
		long count = ingredientService.countAllBySearchData(searchData);
		return count;
	}
}
 