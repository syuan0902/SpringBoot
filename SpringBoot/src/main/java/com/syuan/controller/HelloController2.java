package com.syuan.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController //@RestController = @Controller + @ResponseBody
public class HelloController2 {
	
	private Map<String, Object> result = new HashMap<String, Object>();

	@RequestMapping("/hello2")
//	@ResponseBody //轉換JSON的註解
	public Map<String, Object> hello() {
		result.put("name", "nami");
		result.put("gender", "女");
		
		return result;
	}
	
}
