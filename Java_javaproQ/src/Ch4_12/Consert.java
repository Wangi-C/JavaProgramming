package Ch4_12;

import java.util.Scanner;

public class Consert {

	public static void main(String[] args) {
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		ReservationSystem rs = new ReservationSystem();
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
			int r = s.nextInt();
			if(r == 1) {
				rs.reservation();
			}
			else if(r == 2) {
				rs.view_All();
			}
			else if(r == 3) {
				rs.cancel();
			}
			else if(r == 4) {
				break;
			}
		}
	}
}
