package com.swclass;

public class ConstUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticEx ex = new StaticEx();
		int w = 100;
		int h = 50;
		
		System.out.println(ex.getArea(StaticEx.RECTANGLE, w, h));
		System.out.println(ex.getArea(StaticEx.TRIANGLE, w, h));
	}

}
