package com.spring.springTest.homeWork.payment;

public class PaymentDo {
	PaymentVO vo;
	
	public PaymentVO getVo() {
		return vo;
	}

	public void setVo(PaymentVO vo) {
		this.vo = vo;
	}

	public PaymentVO getPayDo() {
		int position = vo.getPosition();
		int officeHours = vo.getOfficeHours();
		int pay = 0;
		int defaultHours = 8;
		
		int over = officeHours - defaultHours;
		vo.setOver(over);
		if (over > 5) over = 5;
		
		if (position == 1) pay = 4000000;
		else if (position == 2) pay = 3000000;
		else if (position == 3) pay = 2500000;
		else if (position == 4) pay = 2000000;
		
		vo.setDefaultPay(pay);
		
		if (over > 0) {
			pay += ((int) over) * 1000;
		}
		
		else {
			pay += ((int) over - 1) * 5000;
		}
		
		int tax = (int) (pay * 0.1);
		
		vo.setTax(tax);
		vo.setPay((int) (pay - tax));
		
		return vo;
		
	}
}
