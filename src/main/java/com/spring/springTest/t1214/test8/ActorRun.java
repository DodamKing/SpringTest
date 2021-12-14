package com.spring.springTest.t1214.test8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ActorRun {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/actorBeans.xml");
		
		Actor actor1 = (Actor) ctx.getBean("Doctor");
		Actor actor2 = (Actor) ctx.getBean("Police");
		Actor actor3 = (Actor) ctx.getBean("FireMan");

		actor1.casting();
		actor2.casting();
		actor3.casting();
		
		ctx.close();
	}
}
