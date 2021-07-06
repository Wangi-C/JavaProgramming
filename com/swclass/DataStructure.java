package com.swclass;

import java.util.ArrayList;
import java.util.Arrays;

public class DataStructure {
	public static void main(String[] args) {
		String one = "ONE";
		String two = "TWO";
		
		ArrayList list = new ArrayList();
		list.add(one);
		list.add(two);
		list.add(1);
		
		System.out.println(list.size());
		
		list.remove(new String("TWO"));
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(1).getClass());
		System.out.println(list.size());
	}
}
