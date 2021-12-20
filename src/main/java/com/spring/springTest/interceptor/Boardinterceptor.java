package com.spring.springTest.interceptor;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Boardinterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		int level = 6;
		if (session.getAttribute("sLevel") != null) {
			level = (int) session.getAttribute("sLevel");
		}
		System.out.println("게시판 가기 전 컨트롤러 타기 전");
		System.out.println("레벨을 띄워보자");
		System.out.println(level);
		
		if (level > 4) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/tiles/tilesMain");
			dispatcher.forward(request, response);
			return false;
		}
		
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("게시판 들어가고 컨트롤러 타고 들어옴");
	}
}
