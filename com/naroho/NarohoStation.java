package com.naroho;

public class NarohoStation {
	public static void main(String[] args) {
		BaseRocket baseRocket = new BaseRocket01();
		MiddleRocket middleRocket = new MiddleRocket01();
		FinalRocket finalRocket = new FinalRocket01();
		
		Naroho naro = new Naroho(baseRocket, middleRocket, finalRocket);
		naro.launch();
	}
}
