package Ch4_10;

import java.util.Scanner;

public class DicApp {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary();
		Scanner scan = new Scanner(System.in);
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		while(true) {
			System.out.print("�ѱ� �ܾ�? ");
			String word = scan.next();
			if(word.equals("�׸�")) {
				break;
			}
			else {
				if(dic.kor2Eng(word) == null) {
					System.out.println(word + "�� ���� ������ �����ϴ�.");
				}
				else {
					System.out.println(word + "��(��) " + dic.kor2Eng(word));
				}
			}
		}
	}

}
