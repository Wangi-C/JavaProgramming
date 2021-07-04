package com.practice;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "asdflnoHELLOlsndfWORLDosdHELLO  ";
		String str1 = str.trim();
		String str2 = str.substring(10);
		char c = str.charAt(3);
		
		String str3 = str.replaceAll("HELLO", "HI");
		
		int a = str.lastIndexOf("HELLO");
		int b = str.indexOf("HELLO");
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
		System.out.println(str3);
	}

}
