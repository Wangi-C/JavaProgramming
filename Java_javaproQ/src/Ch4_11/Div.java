package Ch4_11;

public class Div extends calculator{

	@Override
	public void setValue(int a, int b) {
		// TODO Auto-generated method stub
		if(b == 0) {
			System.out.println("0���δ� ���� �� �����ϴ�.");
		}
		else {
			result = a / b;
		}
	}

}
