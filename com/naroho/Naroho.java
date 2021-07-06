package com.naroho;

public class Naroho {
	BaseRocket baseRocket = null;
	MiddleRocket middleRocket = null;
	FinalRocket finalRocket = null;
	
	public Naroho(BaseRocket baseRocket, MiddleRocket middleRocket, FinalRocket finalRocket) {
		this.baseRocket = baseRocket;
		this.middleRocket = middleRocket;
		this.finalRocket = finalRocket;
	}
	
	public void launch() {
		this.baseRocket.launch();
		this.baseRocket.disconnect();
		
		this.middleRocket.launch();
		this.middleRocket.disconnect();
		
		this.finalRocket.launch();
		this.finalRocket.stop();
	}
}
