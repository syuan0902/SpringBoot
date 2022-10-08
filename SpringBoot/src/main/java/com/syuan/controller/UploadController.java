package com.syuan.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadController {
	
	Map<String, Object> result = new HashMap<String, Object>();

	@RequestMapping("/uploadFile")
	public Map<String, Object> upload(MultipartFile attach){
		System.out.println("進到UploadController的upload方法");
		//file的name屬性值如果跟此方法的參數名字一樣, 就不用加上請求參數的註解 
		
		//處理文件
		System.out.println("文件名稱: " + attach.getOriginalFilename());
		//System.out.println("文件類型: " + attach.getContentType());
		
		//存到硬碟
		try {
			attach.transferTo(new File("D:/"+attach.getOriginalFilename()));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		result.put("上傳成功", true);
		
		return result;
		
		
	}
	
	
}
