package com.spring.springTest.t1214.test1;

public class CalDo {
	CalVO vo = new CalVO();
	int su1 = vo.getSu1();
	int su2 = vo.getSu2();
	
	public void add(int su1, int su2) {
		System.out.println(su1 + " + " + su2 + " = " + (su1 + su2));
	}
	
	public void sub(int su1, int su2) {
		System.out.println(su1 + " - " + su2 + " = " + (su1 - su2));
	}
	
	public void mul(int su1, int su2) {
		System.out.println(su1 + " * " + su2 + " = " + su1 * su2);
	}
	
	public void div(int su1, int su2) {
		System.out.println(su1 + " / " + su2 + " = " + su1 / su2);
	}
}
