package com.burgerqueen;

public class BurgerClerk {
	private BurgerCook cook = new HoterCook();
	
	public void orderBurger() {
		System.out.println("�ֹ濡 �ܹ��Ÿ� �ֹ��մϴ�.");
		cook.makeBuger();
	}
	
	public void orderSalad() {
		System.out.println("�ֹ濡 �����带 �ֹ��մϴ�.");
		cook.makeSalad();  
	}
}
