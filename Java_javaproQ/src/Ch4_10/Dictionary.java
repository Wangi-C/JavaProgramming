package Ch4_10;

public class Dictionary {
	private static String[] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
	private static String[]	eng = {"love", "baby", "money", "future", "hope"};
	
	public static String kor2Eng(String word) {
		for(int i = 0; i < kor.length; i++) {
			if(kor[i].equals(word)) {
				return eng[i];
			}
		}
		return null;
	}
}
