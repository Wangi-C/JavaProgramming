package Ch4_7;

import java.util.Scanner;

public class MonthSchdule {
	 public Day[] days;
	 Scanner scan = new Scanner(System.in);
	 
	 public MonthSchdule(int Totalday) {
		 this.days = new Day[Totalday];
		 for(int i = 0; i < days.length; i++) {
			 days[i] = new Day();
		 }
	 }
	 
	 public void input() {
		 System.out.print("��¥(1~30)?");
		 int d = scan.nextInt();
		 System.out.print("����(��ĭ�����Է�) : ");
		 String inputSch = scan.next();
		 d--;
		 
		 if(d < 0 || d > 30) {
			 System.out.println("��¥�� �߸� �Է��ϼ̽��ϴ�.");
			 return;
		 }
		 days[d].set(inputSch);
	 }
	 
	 public void view() {
		 System.out.print("��¥(1~30)?");
		 int d = scan.nextInt();
		 d--;
		 if(d < 0 || d > 30) {
			 System.out.println("��¥�� �߸� �Է��ϼ̽��ϴ�.");
			 return;
		 }
		 System.out.print((d+1)+"���� ������ ");
		 days[d].show();
	 }
	 
	 public void finish() {
		 System.out.println("���α׷��� �����մϴ�.");
		 scan.close();
	 }
	 
	 public void run() {
		 System.out.print("�̹��� ������ ���� ���α׷�.");
		 while(true) {
			 System.out.println();
	         System.out.print("����(�Է�:1, ����:2, ������:3) >>");
	         int select = scan.nextInt();
	         if(select == 1) {
	        	 input();
	         }
	         else if(select == 2) {
	        	 view();
	         }
	         else if(select == 3) {
	        	 finish();
	        	 break;
	         }
		 }
	 }
	 
	 public static void main(String[] args) {
		 MonthSchdule april = new MonthSchdule(30);
		 april.run();
	 }
}
