package Ch5_10;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̽�");
		dic.put("���繮", "c++");
		System.out.println("���繮�� ���� "+dic.get("���繮"));
		System.out.println("Ȳ������ ���� "+dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� "+dic.get("Ȳ����"));
	}

}
