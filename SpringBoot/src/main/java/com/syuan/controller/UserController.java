package com.syuan.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syuan.model.User;

@Controller
public class UserController {

	@RequestMapping("/list")
	public String userList(Model m) {
		//模擬用戶資料
		List<User> list = new ArrayList<User>();
		list.add(new User(1, "小米", 18));
		list.add(new User(2, "小胖", 20));
		list.add(new User(3, "小張", 35));
		
		//把資料存入Model
		m.addAttribute("list", list);
		
		//跳轉到JSP頁面
		return "list";
		
	}
	
}
