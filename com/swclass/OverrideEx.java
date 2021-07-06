package com.swclass;

public class OverrideEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		요리사 one = new 중화요리사();
		요리사 two = new 일식요리사();
		
		OverrideEx ex = new OverrideEx();
		ex.주방(one);
		ex.주방(two);
	}

	public void 주방(요리사 parent) {
		parent.요리하다();
		parent.손질하다();
		parent.설거지하다();
		parent.geti();
	}
}
