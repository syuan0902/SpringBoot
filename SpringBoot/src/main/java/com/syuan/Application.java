package com.syuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.syuan.servlet.HelloFilter;
import com.syuan.servlet.HelloListener;
import com.syuan.servlet.HelloServlet;

/**
 * SpringBoot的啟動器
 * @author syuan
 *
 */
@SpringBootApplication
//讓SpringBoot掃描Servlet相關註解
//@ServletComponentScan 
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	//將Servlet註冊為bean, 在方法執行完後會把回傳的物件作為一個Bean, 放在Spring容器裡面
	@Bean //
	public ServletRegistrationBean<HelloServlet> getServletRegistrationBean() {
		ServletRegistrationBean<HelloServlet> servletBean 
			= new ServletRegistrationBean<HelloServlet>(new HelloServlet());
		//設置訪問路徑
		servletBean.addUrlMappings("/helloServletBean");
		return servletBean;
		
	}
	
	//將Filter註冊為bean
	@Bean
	public FilterRegistrationBean<HelloFilter> getFilterRegistrationBean(){
		FilterRegistrationBean<HelloFilter> filterBean 
			= new FilterRegistrationBean<HelloFilter>(new HelloFilter());
		filterBean.addUrlPatterns("/helloServletBean");
		return filterBean;
	
	}
	
	//將Listener註冊為bean
	@Bean
	public ServletListenerRegistrationBean<HelloListener> getServletListenerRegistrationBean() {
		ServletListenerRegistrationBean<HelloListener> listenerBean 
			= new ServletListenerRegistrationBean<HelloListener>(new HelloListener());
		return listenerBean;
	}
	
}