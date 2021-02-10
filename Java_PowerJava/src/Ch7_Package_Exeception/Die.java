package Ch7_Package_Exeception;
//1번
public class Die {
	int num;
	public Die() {
		this.num = 1;
	}
	public int roll() {
		int score = (int)(Math.random()*6 + 1);
		return score;
	}
	public void setValue() {
		this.num = roll();
	}
	public int getValue() {
		return this.num;
	}
	public String toString() {
		return "현재 주사위 상태 : "+ getValue();
	}
}
