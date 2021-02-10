package baek;

import java.util.Scanner;

import javax.naming.spi.ResolveResult;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("칸 수를 정하시오(높이 너비) : ");
		int w = scan.nextInt();
		int h = scan.nextInt();
		System.out.print("막대 갯수를 정하시오 : ");
		int n = scan.nextInt();
		
		game g = new game(w, h, n);
		int[][] gArray = g.makeArray();
		
		for(int i = 0; i < n; i++) {
			gArray = g.doColor(gArray);
		}
		
		for(int i = 0; i < w; i++) {
			for(int j =0; j< h; j++) {
				System.out.print(gArray[i][j]);
			}
			System.out.println();
		}
	}

}
