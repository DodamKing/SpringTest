package com.spring.springTest.t1214.test1;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		CalDo calc = new CalDo();
//		
//		calc.setSu1(100);
//		calc.setSu2(200);
//		
//		calc.add();
//		calc.sub();
//		calc.mul();
//		calc.div();
		
		Scanner scanner = new Scanner(System.in);
		CalVO vo = new CalVO();
		
		
		System.out.print("첫번째 수 : ");
		vo.setSu1(scanner.nextInt());
		System.out.print("두번째 수 : ");
		vo.setSu2(scanner.nextInt());
		
		int su1 = vo.getSu1();
		int su2 = vo.getSu2();
		
		calc.add(su1, su2);
		calc.sub(su1, su2);
		calc.mul(su1, su2);
		calc.div(su1, su2);
		
		
		
		scanner.close();
	}
}
