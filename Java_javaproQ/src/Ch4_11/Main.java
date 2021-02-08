package Ch4_11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator c = null;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>> ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		String cal = scan.next();
		
		if(cal.equals("+")) {
			c = new Add();
		}
		else if(cal.equals("-")) {
			c = new Sub();
		}
		else if(cal.equals("*")) {
			c = new Mul();
		}
		else if(cal.equals("/")) {
			c = new Div();
		}
		c.setValue(a, b);
		System.out.println(c.calculate());
	}

}
