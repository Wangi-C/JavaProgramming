 package com.swclass;

public class HelloJava {
	static {
		System.out.println("메소드 영역에 한번만 올라갑니다.");
	}
	
	{
		System.out.println("인스턴스 블럭");
	}

	HelloJava() {
		System.out.println("생성자 호출");
	}
	
	public static void main(String[] args) {
		
		new HelloJava();
		new HelloJava();
		new HelloJava();
		
		//TODO - 나중에 구현하기
	}

}