package Ch7_Package_Exeception;

import java.util.Scanner;
import java.util.StringTokenizer;

public class stringTok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열을 입력하시요 : ");
		StringTokenizer st = new StringTokenizer(scan.nextLine()," ");
		int n = st.countTokens();
		for(int i = 0; i<n; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println("모두 "+ n +" 개의 단어가 있습니다.");
	}

}
