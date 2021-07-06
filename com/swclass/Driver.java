package com.swclass;

import java.util.HashMap;

public class Driver {

	public static void main(String[] args) {
		HashMap<Integer, Book> map = new HashMap<Integer, Book>();
		Book one = new Book();
		one.setTitle("홍길동전");
		
		Book two = new Book();
		two.setTitle("별주부전");
		
		map.put(1, one);
		map.put(3, two);
		
		System.out.println("1의 value : " + map.get(1)); 
		//get은 toString() 을 이용해서 가져온다. Book에는 toString()이 재정의 되어 있기 때문에 get을 했을 때 홍길동전0 이 나온다.
		//재정의가 안되어 있으면 Object의 toString()을 사용한다.
		System.out.println("3의 value : " + map.get(3));
	}
}
