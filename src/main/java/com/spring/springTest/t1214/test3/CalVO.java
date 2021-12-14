package com.spring.springTest.t1214.test3;

public class CalVO {
	private int su1;
	private int su2;
	private CalDo calc = new CalDo();
	
	
	public int getSu1() {
		return su1;
	}
	public void setSu1(int su1) {
		this.su1 = su1;
	}
	public int getSu2() {
		return su2;
	}
	public void setSu2(int su2) {
		this.su2 = su2;
	}
	
	public void add() {
		calc.add(su1, su2);
	}
	public void sub() {
		calc.sub(su1, su2);
	}
	public void mul() {
		calc.mul(su1, su2);
	}
	public void div() {
		calc.div(su1, su2);
	}
	
}
