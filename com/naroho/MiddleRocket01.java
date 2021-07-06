package com.naroho;

public class MiddleRocket01 implements MiddleRocket {
	@Override
	public void launch() {
		System.out.println("Middle Rocket Launch..");
	}
	
	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Middle Rocket disconnected..");
	}
}
