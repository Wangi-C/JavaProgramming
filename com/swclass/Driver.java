package com.swclass;

import java.util.HashMap;

public class Driver {

	public static void main(String[] args) {
		HashMap<Integer, Book> map = new HashMap<Integer, Book>();
		Book one = new Book();
		one.setTitle("ȫ�浿��");
		
		Book two = new Book();
		two.setTitle("���ֺ���");
		
		map.put(1, one);
		map.put(3, two);
		
		System.out.println("1�� value : " + map.get(1)); 
		//get�� toString() �� �̿��ؼ� �����´�. Book���� toString()�� ������ �Ǿ� �ֱ� ������ get�� ���� �� ȫ�浿��0 �� ���´�.
		//�����ǰ� �ȵǾ� ������ Object�� toString()�� ����Ѵ�.
		System.out.println("3�� value : " + map.get(3));
	}
}
