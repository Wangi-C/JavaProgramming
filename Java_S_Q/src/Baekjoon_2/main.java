package Baekjoon_2;

import java.util.Scanner;

public class main {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		
		Scanner scan = new Scanner(System.in);
		int orderNum = scan.nextInt();
		
		String[] stringArray = new String[orderNum];
		
		for(int i = 0; i < orderNum; i++) {
			String order = scan.nextLine();
			String[] orderA = order.split("");
			
			for(int j = 0; j < orderA.length; j++) {
				if(orderA[j].equals("(")) {
					stack.push("(");
				}
				else if(orderA[j].equals(")")) {
					stack.pop();
				}
			}
			if(stack.size() == 0) {
				stringArray[i] = "Yes";
			}else {
				stringArray[i] = "No";
			}
		}
		
		
	}

}
