package com.mp3;

public class AppleMp3 implements MyMp3 {
	@Override
	public void playMp3() {
		// TODO Auto-generated method stub
		System.out.println("Apple제품은 mp3지원");
	}
	
	@Override
	public void listenFM() {
		// TODO Auto-generated method stub
		System.out.println("Apple에서 fm수신 가능");
	}
	
	@Override
	public void viewPhoto() {
		// TODO Auto-generated method stub
		System.out.println("Apple는 이미지 뷰어 제공");
	}
}
