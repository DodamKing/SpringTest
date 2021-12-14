package com.spring.springTest.homeWork.payment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PaymentRun {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/paymentBeans.xml");
		PaymentDo pay1 = (PaymentDo) ctx.getBean("pay1");
		PaymentDo pay2 = (PaymentDo) ctx.getBean("pay2");
		PaymentDo pay3 = (PaymentDo) ctx.getBean("pay3");
		PaymentPrint print = new PaymentPrint();
		
		PaymentVO vo =  pay1.getPayDo();
		print.getprint(vo);
		
		vo =  pay2.getPayDo();
		print.getprint(vo);

		vo =  pay3.getPayDo();
		print.getprint(vo);
		
		ctx.close();
	}
}
