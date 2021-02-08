package Ch4_10;

import java.util.Scanner;

public class DicApp {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary();
		Scanner scan = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {
			System.out.print("한글 단어? ");
			String word = scan.next();
			if(word.equals("그만")) {
				break;
			}
			else {
				if(dic.kor2Eng(word) == null) {
					System.out.println(word + "는 저의 사전에 없습니다.");
				}
				else {
					System.out.println(word + "은(는) " + dic.kor2Eng(word));
				}
			}
		}
	}

}
