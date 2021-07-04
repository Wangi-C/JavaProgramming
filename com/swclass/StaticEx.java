package com.swclass;

public class StaticEx {
	
	public static final int RECTANGLE = 1;
	public static final int TRIANGLE = 2;
	
	public double getArea(int type, int width, int height) {
		double area = 0.0;
		
		if (type == RECTANGLE) {
			area = width * height;
		} else if (type == TRIANGLE) {
			area = (width * height) / 2;
		} 
		
		return area;
	}

}
