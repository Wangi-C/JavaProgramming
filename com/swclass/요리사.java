package com.swclass;

public abstract class 요리사 {
	private int i = 0;
	
	abstract void 요리하다();
	
	abstract void 설거지하다();
	
	public void 손질하다() {
		System.out.println("손질하다");
	}
	
	public void geti() {
		System.out.println(i);
	}
}
