package com.spring.springTest.t1214.test5;

public class BMIVO {
	private double lowWeight;
	private double normal;
	private double overWeight;
	private double obesity;
	
	
	public double getLowWeight() {
		return lowWeight;
	}
	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}
	public double getNormal() {
		return normal;
	}
	public void setNormal(double normal) {
		this.normal = normal;
	}
	public double getOverWeight() {
		return overWeight;
	}
	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}
	public double getObesity() {
		return obesity;
	}
	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
	
	public void getBmiResult(double height, double weight) {
		double h = height / 100;
		double bmi = weight / (h * h);
		
		System.out.println("BMI 지수는 " + (int) bmi + " 입니다.");
		
		if (bmi > obesity) {
			System.out.println("비만 입니다.");
		}
		
		else if (bmi > overWeight) {
			System.out.println("과체중 입니다.");
		}
		
		else if (bmi > normal) {
			System.out.println("정상 입니다.");
		}
		
		else {
			System.out.println("저체중 입니다.");
		}
	}
}
