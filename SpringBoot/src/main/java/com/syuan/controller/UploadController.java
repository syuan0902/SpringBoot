package com.syuan.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {

	@RequestMapping("/upload")
	public String upload(@RequestParam("headIcon") MultipartFile file)
			throws Exception, IOException {

		// 保存文件
		String uploadPath = "C:\\Users\\kuros\\OneDrive\\文件\\SpringBootUpload";
		file.transferTo(
				new File(uploadPath + File.separator + System.currentTimeMillis() + file.getOriginalFilename()));

		return "index";

	}
}
