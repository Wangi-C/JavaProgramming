package com.swclass;

public class OpticalMouse extends WheelMouse {
	public void clickLeft() {
		System.out.println("�������� ���� Ŭ��");
	}
	
	@Override
	public void clickRight() {
		System.out.println("�������� ������ Ŭ��");
	}
	
	public void clickOriginalLeft() {
		super.clickLeft();
	}
	
	public void clickOriginalRight() {
		super.clickRight();
	}
}
