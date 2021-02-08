package Ch4_8;

import java.util.Scanner;

public class PhoneBook {
	Scanner scan = new Scanner(System.in);
	Phone[] phonebook;
	
	public PhoneBook() {
		System.out.print("인원수 >> ");
		int num = scan.nextInt();
		phonebook = new Phone[num];
	}
	
	public void input() {
		for(int i=0; i<phonebook.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>> ");
			String name = scan.next();
			String tel = scan.next();
			
			phonebook[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
	}
	
	public String search() {
		int count = 0;
		
		while(true) {
			System.out.print("검색할 이름>> ");
			String SearchName = scan.next();
			if(SearchName.equals("그만")) {
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
				System.out.println(SearchName + "이 없습니다.");
				count = 0;
			}
			continue;
		}
		return "프로그램을 종료합니다.";
	}
	
	public static void main(String[] args) {
		PhoneBook pb = new PhoneBook();
		pb.input();
		String result = pb.search();
		System.out.println(result);
	}
}
