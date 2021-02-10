package baek;

import java.lang.reflect.Array;
import java.util.Scanner;

public class game {
	private int n;
	private int[] hsArray = new int[2];
	
	public game(int w, int h, int n) {
		hsArray[0] = w;
		hsArray[1] = h;
		this.n = n;
	}
	
	public int[][] makeArray() {
		int w = hsArray[0];
		int h = hsArray[1];
		int[][] newArray = new int[w][h];
		for(int i = 0; i < w; i++) {
			for(int j = 0; j < h; j++) {
				newArray[i][j] = 0;
			}
		}
		return newArray;
	}
	
	public int[][] doColor(int[][] a) {
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		int d = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		if(d == 0) {
			for(int i = (y-1); i < (y + l -1); i++) {
				a[x-1][i] = 1;
			}
		}
		else if(d == 1) {
			for(int i = (x-1); i < (x + l -1); i++) {
				a[i][y-1] = 1;
			}
		}
		return a;
	}
}