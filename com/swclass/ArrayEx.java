package com.swclass;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		String str = "ABC";
		char[] arr1 = str.toCharArray();
		System.out.println(Arrays.toString(arr1));
		byte[] arr2 = str.getBytes();
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println((short)arr1[i]);
		}
		System.out.println(Arrays.toString(arr2));
	}
}
