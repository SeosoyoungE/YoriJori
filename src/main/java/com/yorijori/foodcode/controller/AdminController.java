package com.yorijori.foodcode.controller;

import java.awt.print.Pageable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yorijori.foodcode.jpa.entity.UserInfo;
import com.yorijori.foodcode.service.MemberService;
import com.yorijori.foodcode.service.RecipeService;

@Controller
public class AdminController {
	MemberService userService;
	RecipeService rcpService;

	@Autowired
	public AdminController(MemberService userService, RecipeService rcpService) {
		super();
		this.userService = userService;
		this.rcpService = rcpService;
	}

	@RequestMapping("/admin")
	public String getAdminPage() {
		return "thymeleaf/admin/index";
	}

	@RequestMapping("/AdminUserPage")
	public String getAdminUserPage(Model model) {
		List<UserInfo> list = userService.selectall(1);
		List<UserInfo> list2 = userService.selectall(0);
		int count = 0;
		for (UserInfo userInfo : list) {
			LocalDate date = userInfo.getDate().toLocalDate();
			if (date.equals(LocalDate.now())) {
				count++;
			}
		}
		model.addAttribute("todayuser", count);
		model.addAttribute("userlist", list);
		model.addAttribute("secessioncount", list2.size());
		model.addAttribute("secessionlist", list2);
		model.addAttribute("usercount", userService.userCount("회원"));
		model.addAttribute("date", LocalDate.now());

		return "thymeleaf/admin/AdminUserPage";
	}

	@ResponseBody
	@PostMapping("/UserDelete")
	public ResponseEntity deleteUser(@RequestParam("userId") String userId) {
		System.out.println(userId);
		userService.updateUserStateByUserId(userId, 0);
		return ResponseEntity.ok().build();
	}

	@ResponseBody
	@PostMapping("/UserRestore")
	public ResponseEntity restoreUser(@RequestParam("userId") String userId) {
		System.out.println(userId);
		userService.updateUserStateByUserId(userId, 1);
		return ResponseEntity.ok().build();
	}

	@RequestMapping("/admin/recipe")
	public String getAdminRcpPage(Model model) {
		List<Long> purposelist = rcpService.countByCategoryNo(5, 9);
		List<Long> countrylist = rcpService.countByCategoryNo(10, 13);
		List<Long> typelist = rcpService.countByCategoryNo(15, 20);
		List<Long> foodlist = rcpService.countByCategoryNo(21, 25);
		model.addAttribute("purposelist", purposelist);
		model.addAttribute("countrylist", countrylist);
		model.addAttribute("typelist", typelist);
		model.addAttribute("foodlist", foodlist);
		return "thymeleaf/admin/recipe";
		
	}

}
