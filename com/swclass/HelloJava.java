 package com.swclass;

public class HelloJava {
	static {
		System.out.println("�޼ҵ� ������ �ѹ��� �ö󰩴ϴ�.");
	}
	
	{
		System.out.println("�ν��Ͻ� ��");
	}

	HelloJava() {
		System.out.println("������ ȣ��");
	}
	
	public static void main(String[] args) {
		
		new HelloJava();
		new HelloJava();
		new HelloJava();
		
		//TODO - ���߿� �����ϱ�
	}

}