package com.spring.springTest.t1214.test5;

public class UserVO {
	private String name;
	private double height;
	private double weight;
	
	private BMIVO bmivo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public BMIVO getBmivo() {
		return bmivo;
	}

	public void setBmivo(BMIVO bmivo) {
		this.bmivo = bmivo;
	}
	
	public void outValue() {
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("체중 : " + weight);
		
		bmivo.getBmiResult(height, weight);
	}
}
