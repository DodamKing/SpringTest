package com.spring.springTest.homeWork.payment;

public class PaymentPrint {
	public void getprint(PaymentVO vo) {
		String name = vo.getName();
		int officeHours = vo.getOfficeHours();
		int position = vo.getPosition();
		int pay = vo.getPay();
		int defaultPay = vo.getDefaultPay();
		int tax = vo.getTax();
		int over = vo.getOver();
		
		String posi;
		if (position == 1) posi = "부장";
		else if (position == 2) posi = "과장";
		else if (position == 3) posi = "대리";
		else posi = "사원";
		
		System.out.println("=================================================");
		System.out.println("직급 : " + posi);
		System.out.println("이름 : " + name);
		System.out.println("근무시간 : " + officeHours + "시간");
		System.out.println("초과시간 : " + over + "시간");
		System.out.println("기본급 : " + defaultPay + "원");
		
		if (over > 5) System.out.println("수당 계산(최대 5시간) : 1000원 * " + "5시간 = 5000원");
		else if (over > 0) System.out.println("수당 계산(최대 5시간) : 1000원 * " + over + "시간 = " + 1000 * over + "원");
		else System.out.println("수당 계산 : -5000원 * " + (over * -1) + "시간 = " + 5000 * over + "원");
		
		System.out.println("공제액 : " + tax + "원");
		System.out.println("총수령액(기본급 + 수당 - 공제액) : " + pay + "원");
		System.out.println("=================================================");
	}
}
