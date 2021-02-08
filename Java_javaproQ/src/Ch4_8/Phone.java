package Ch4_8;

public class Phone {
	public String name, tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getTel() {
		return this.tel;
	}
	public String toString() {
		return this.name + "의 번호는 " + this.tel + "입니다.";
	}
}
