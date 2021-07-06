package com.burgerqueen;

public class BurgerClerk {
	private BurgerCook cook = new HoterCook();
	
	public void orderBurger() {
		System.out.println("주방에 햄버거를 주문합니다.");
		cook.makeBuger();
	}
	
	public void orderSalad() {
		System.out.println("주방에 샐러드를 주문합니다.");
		cook.makeSalad();  
	}
}
