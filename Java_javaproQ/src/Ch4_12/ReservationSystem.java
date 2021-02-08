package Ch4_12;

import java.util.Scanner;

public class ReservationSystem {
	String[][] R = new String [3][11];
	Scanner s = new Scanner(System.in);
	
	public ReservationSystem() {
		R[0][0] = "S>>";
		R[1][0] = "A>>";
		R[2][0] = "B>>";
		for(int i = 0; i < 3; i++) {
			for(int j = 1; j < 11; j++) {
				R[i][j] = "---";
			}
		}
	}
	
	public void reservation() {
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		int num1 = s.nextInt();
		view(num1);
		
		System.out.print("이름>>");
		String name = s.next();
		System.out.print("번호>>");
		int num2 = s.nextInt();
		
		R[num1-1][num2] = name;
	}
	
	public void view_All() {
		for(String[] k : R) {
			for(String j : k) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}
	
	public void view(int seat) {
		for(String k : R[seat-1]) {
			System.out.print(k+" ");
		}
		System.out.println();
	}
	
	public void cancel() {
		System.out.print("좌석 S(1), A(2), B(3)>>");
		int seat = s.nextInt();
		view(seat);
		System.out.print("이름>>");
		String name = s.next();
		
		for(int i = 0; i < 11; i++) {
			if(R[seat-1][i].equals(name)) {
				R[seat-1][i] = "---";
			}
		}
	}
}
