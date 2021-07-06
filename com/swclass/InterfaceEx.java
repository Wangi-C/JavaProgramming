package com.swclass;

public class InterfaceEx {
	public static void main(String[] args) {
		요리사 one = new 일식요리사();
		요리사 two = new 중화요리사();
		
		one.요리하다();
		one.설거지하다();
		
		two.요리하다();
		two.설거지하다();
		
		one.geti();
		two.geti();
	}
}
