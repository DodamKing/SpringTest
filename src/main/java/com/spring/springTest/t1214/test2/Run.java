package com.spring.springTest.t1214.test2;

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
		
		
		System.out.print("첫번째 수 : ");
		int su1 = scanner.nextInt();
		System.out.print("두번째 수 : ");
		int su2 = scanner.nextInt();
		
		CalVO vo = new CalVO(su1, su2);

		
		vo.add();
		vo.sub();
		vo.mul();
		vo.div();
		
		
		
		scanner.close();
	}
}
