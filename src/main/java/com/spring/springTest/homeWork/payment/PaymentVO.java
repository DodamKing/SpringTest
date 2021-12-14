package com.spring.springTest.homeWork.payment;

public class PaymentVO {
	private int position;
	private int officeHours;
	private String name;
	private int pay;
	private int defaultPay;
	private int tax;
	private int over;
	
	
	public int getOver() {
		return over;
	}
	public void setOver(int over) {
		this.over = over;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public int getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(int officeHours) {
		this.officeHours = officeHours;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getDefaultPay() {
		return defaultPay;
	}
	public void setDefaultPay(int defaultPay) {
		this.defaultPay = defaultPay;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	
}
