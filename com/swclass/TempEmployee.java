package com.swclass;

public class TempEmployee extends Employee {
	private int hireYear;
	
	public TempEmployee(String empno, String name, int pay, int hireYear) {
		super(empno, name, pay);
		this.hireYear = hireYear;
	}
	
	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		return pay / (double)12;
	}
}
