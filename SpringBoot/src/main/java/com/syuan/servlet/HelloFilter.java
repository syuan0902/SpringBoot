package com.syuan.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/helloServlet") //這裡寫的是Filter要攔截的路徑
public class HelloFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("執行了Filter前面的代碼");
		//放行執行目標資源
		chain.doFilter(request, response);
		System.out.println("執行了Filter後面的代碼");
		
		

	}

}
