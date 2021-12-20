package com.spring.springTest.interceptor;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Guestinterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
//		HttpSession session = request.getSession();
//		String level = "6";
//		if (session.getAttribute("sLevel") != null) {
//			level = (String) session.getAttribute("sLevel");
//		}
//		
//		int lv = Integer.parseInt(level);
//		if (lv > 5) {
//			RequestDispatcher dispatcher = request.getRequestDispatcher("/tiles/guest/login");
//			dispatcher.forward(request, response);
//			return false;
//		}
		
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("방명록 들어가고 컨트롤러 타고 들어옴");
	}
}
