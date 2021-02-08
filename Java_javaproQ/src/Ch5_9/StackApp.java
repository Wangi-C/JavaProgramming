package Ch5_9;

import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		int num = sc.nextInt();
		StringStack stack = new StringStack(num);
		while (true) {
			System.out.print("���ڿ� �Է� >> ");
			String val = sc.next();
			if (val.equals("�׸�"))
				break;
			if (!stack.push(val)) {
				System.out.println("������ �� ���� Ǫ�� �Ұ�!");
			}
		}
		System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
		int len = stack.length();
		for (int i = 0; i < len; i++) {
			String s = stack.pop();
			System.out.print(s + " ");
		}
		sc.close();
	}

}
