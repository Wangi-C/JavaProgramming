package com.sitemember;

import java.util.Arrays;
import java.util.Scanner;

public class Site {
	private static int lastNum = 0;
	private MemberNumMaker[] memberArray = new MemberNumMaker[10];
	
	public static void main(String[] args) {
		Site site = new Site();
		
		for (int i = 0; i < 10; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.print("이름을 입력하세요 : ");
			String name = scan.nextLine();
			System.out.print("주소를 입력하세요 : ");
			String address = scan.nextLine();
			
			Person person = new Person();
			person.setName(name);
			person.setAddress(address);
			
			MemberNumMaker one = new MemberNumMaker(person);
			site.memberArray[lastNum] = one;
			lastNum++;
			System.out.println("yes");
			
			System.out.println(one);
		}
		
		System.out.println(lastNum);
	}

}
