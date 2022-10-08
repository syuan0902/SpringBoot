package com.syuan.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	private Map<String, Object> result = new HashMap<String, Object>();

	@RequestMapping("/hello")
	@ResponseBody //轉換JSON的註解
	public Map<String, Object> hello() {
		result.put("name", "sunkist");
		result.put("gender", "男");
		
		return result;
	}
	
}
