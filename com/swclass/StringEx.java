package com.swclass;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "sdf";
		
		
		StringBuilder str = new StringBuilder(13);
		str.append("abc0");
		str.append("asdfadfasfasdfas");
		
		str.insert(5, "HELLO");
		
		str.delete(12, 13);
		
		str.deleteCharAt(2);
		
		System.out.println(str);
		System.out.println(str.length());
	}

}
