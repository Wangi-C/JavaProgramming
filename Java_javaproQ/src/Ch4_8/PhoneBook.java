package Ch4_8;

import java.util.Scanner;

public class PhoneBook {
	Scanner scan = new Scanner(System.in);
	Phone[] phonebook;
	
	public PhoneBook() {
		System.out.print("�ο��� >> ");
		int num = scan.nextInt();
		phonebook = new Phone[num];
	}
	
	public void input() {
		for(int i=0; i<phonebook.length; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>> ");
			String name = scan.next();
			String tel = scan.next();
			
			phonebook[i] = new Phone(name, tel);
		}
		System.out.println("����Ǿ����ϴ�...");
	}
	
	public String search() {
		int count = 0;
		
		while(true) {
			System.out.print("�˻��� �̸�>> ");
			String SearchName = scan.next();
			if(SearchName.equals("�׸�")) {
				break;
			}
			for(Phone p : phonebook) {
				if(SearchName.equals(p.name)) {
					System.out.println(p);
					count = 0;
					break;
				}
				count++;
			}
			if(count == phonebook.length) {
				System.out.println(SearchName + "�� �����ϴ�.");
				count = 0;
			}
			continue;
		}
		return "���α׷��� �����մϴ�.";
	}
	
	public static void main(String[] args) {
		PhoneBook pb = new PhoneBook();
		pb.input();
		String result = pb.search();
		System.out.println(result);
	}
}
