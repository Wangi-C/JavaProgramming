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
		 System.out.print("날짜(1~30)?");
		 int d = scan.nextInt();
		 System.out.print("할일(빈칸없이입력) : ");
		 String inputSch = scan.next();
		 d--;
		 
		 if(d < 0 || d > 30) {
			 System.out.println("날짜를 잘못 입력하셨습니다.");
			 return;
		 }
		 days[d].set(inputSch);
	 }
	 
	 public void view() {
		 System.out.print("날짜(1~30)?");
		 int d = scan.nextInt();
		 d--;
		 if(d < 0 || d > 30) {
			 System.out.println("날짜를 잘못 입력하셨습니다.");
			 return;
		 }
		 System.out.print((d+1)+"일의 할일은 ");
		 days[d].show();
	 }
	 
	 public void finish() {
		 System.out.println("프로그램을 종료합니다.");
		 scan.close();
	 }
	 
	 public void run() {
		 System.out.print("이번달 스케쥴 관리 프로그램.");
		 while(true) {
			 System.out.println();
	         System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
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
