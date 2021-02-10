package baek;

import java.util.Scanner;

public class main1 {
	public static void main(String[] args) {
		int[][] Qarray = new int[10][10];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				Qarray[i][j] = scan.nextInt();
			}
		}
		
		
		Ant ant = new Ant(Qarray, 1, 1);
		ant.move();
		int[][] result = ant.array;
		
		for(int[] k : result) {
			for(int h : k) {
				System.out.print(h);
			}
			System.out.println();
		}
	}
}
