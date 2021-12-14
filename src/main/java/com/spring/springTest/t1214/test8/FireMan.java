package com.spring.springTest.t1214.test8;

public class FireMan implements Actor {
	private String name;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void casting() {
		System.out.println(name + "님의 역할은 '소방관' 입니다.");
	}
}
