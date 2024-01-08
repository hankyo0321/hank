package com.blog.InterCeptor;

import java.io.IOException;

import org.springframework.web.context.request.WebRequestInterceptor;
import org.springframework.web.servlet.handler.WebRequestHandlerInterceptorAdapter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginInterCeptor extends WebRequestHandlerInterceptorAdapter{

	
	
	public LoginInterCeptor(WebRequestInterceptor requestInterceptor) {
		super(requestInterceptor);
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
		if(request.getSession().getAttribute("user") == null) {
			response.sendRedirect("/admin");
			return false;
		}
		
		return true;
	}

}
