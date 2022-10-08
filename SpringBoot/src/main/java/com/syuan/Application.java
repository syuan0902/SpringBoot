package com.syuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * SpringBoot的啟動器
 * @author syuan
 *
 */
@SpringBootApplication
@ServletComponentScan //讓SpringBoot掃描Servlet相關註解
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}