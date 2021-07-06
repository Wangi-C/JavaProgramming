package com.swclass;

public class CatchToyMachine {
	private Toy[] toys;
	
	public CatchToyMachine() {
		toys = new Toy[10];
		for (int i = 0; i < toys.length; i++) {
			Toy toy = null;
			
			if(i % 3 == 0) {
				toy = new Doll();
				toy.setName("인형" + i);
			} else if (i % 3 == 1) {
				toy = new KeyHolder();
				toy.setName("키걸이" + i);
			} else if (i % 3 == 2) {
				toy = new BubbleGum();
				toy.setName("풍선검" + i);
			}
			
			toys[i] = toy;
		}
	}
	
	public void catchToy() {
		for (Toy t : this.toys) {
			System.out.println(t.getName());
		}
	}
	
	public static void main(String[] args) {
		CatchToyMachine machine = new CatchToyMachine();
		machine.catchToy();
	}
}
