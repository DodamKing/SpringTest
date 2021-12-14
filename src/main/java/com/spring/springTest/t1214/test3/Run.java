package com.spring.springTest.t1214.test3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/test4Beans.xml");
		CalVO vo = (CalVO) ctx.getBean("CalVO");
		
		
		vo.add();
		vo.sub();
		vo.mul();
		vo.div();
		
		ctx.close();
	}
}
