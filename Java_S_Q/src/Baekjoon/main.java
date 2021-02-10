package Baekjoon;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<Integer>();
		
		Scanner scan = new Scanner(System.in);
		int orderN = scan.nextInt();
		
		for(int i = 0; i < orderN; i++) {
			String order = scan.nextLine();
			String[] sp = order.split(" ");
			if(sp[0].equals("push")) {
				int stackNum = Integer.parseInt(sp[1]);
				s.push(stackNum);
			}
			else if(sp[0].equals("pop")) {
				System.out.println(s.pop());
			}
			else if(sp[0].equals("size")) {
				System.out.println(s.size());
				
			}
			else if(sp[0].equals("empty")) {
				System.out.println(s.empty());
				
			}
			else if(sp[0].equals("top")) {
				System.out.println(s.top());
				
			}
		}
	}

}
