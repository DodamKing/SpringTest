package com.spring.springTest.homeWork.sungjuk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SungjukRun {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/sungjukBeans.xml");
		SungjukVO vo1 = (SungjukVO) ctx.getBean("vo1");
		SungjukVO vo2 = (SungjukVO) ctx.getBean("vo2");
		SungjukVO vo3 = (SungjukVO) ctx.getBean("vo3");
		
		vo1.getSungjukResult();
		vo2.getSungjukResult();
		vo3.getSungjukResult();
		
		SungjukVO vo4 = (SungjukVO) ctx.getBean("vo4");
		vo4.getSungjukResult();
		
		ctx.close();
	}
}
