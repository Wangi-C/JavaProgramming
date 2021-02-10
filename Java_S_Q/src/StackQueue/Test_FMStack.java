package StackQueue;

import java.util.EmptyStackException;

public class Test_FMStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FixedMultiStacks ms = new FixedMultiStacks(5);
		try {
			ms.push(0, 1);
			ms.push(0, 2);
			ms.push(0, 3);
			ms.push(0, 4);
			ms.push(0, 5);
			
			ms.push(1, 11);
			ms.push(1, 21);
			ms.push(1, 31);
			ms.push(1, 41);
			ms.push(1, 51);
		} catch (FullStackException e) {
			// TODO: handle exception
			System.out.println("full12");
		}
		
		try {
			System.out.println("Stack #0 : " + ms.pop(0));
			System.out.println("Stack #0 : " + ms.pop(0));
			System.out.println("Stack #0 : " + ms.peek(0));
			System.out.println("Stack #0 : " + ms.pop(0));
			System.out.println("Stack #0 : " + ms.isEmpty(0));
			System.out.println("Stack #0 : " + ms.pop(0));
			System.out.println("Stack #0 : " + ms.pop(0));
			System.out.println("Stack #0 : " + ms.isEmpty(0));
			
			System.out.println("////////////////////////////////");
			
			System.out.println("Stack #1 : " + ms.pop(1));
			System.out.println("Stack #1 : " + ms.pop(1));
			System.out.println("Stack #1 : " + ms.peek(1));
			System.out.println("Stack #1 : " + ms.pop(1));
			System.out.println("Stack #1 : " + ms.isEmpty(1));
			System.out.println("Stack #1 : " + ms.pop(1));
			System.out.println("Stack #1 : " + ms.pop(1));
			System.out.println("Stack #1 : " + ms.isEmpty(1));
			
		} catch (EmptyStackException e) {
			// TODO: handle exception
			System.out.println("Empty");
		}
		
	}

}
