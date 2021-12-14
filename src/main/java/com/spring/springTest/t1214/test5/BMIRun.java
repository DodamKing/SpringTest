package com.spring.springTest.t1214.test5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BMIRun {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/BMIBeans.xml");
		
		UserVO vo1 = (UserVO) ctx.getBean("vo1");
		vo1.outValue();
		System.out.println("------------------------------");
		UserVO vo2 = (UserVO) ctx.getBean("vo2");
		vo2.outValue();
		System.out.println("------------------------------");
		UserVO vo3 = (UserVO) ctx.getBean("vo3");
		vo3.outValue();
		System.out.println("------------------------------");
		
		ctx.close();
		
	}
}
