package com.mp3;

public class Mp3Test {
	
	public void test(MyMp3 mp3) {
		mp3.listenFM();
		mp3.playMp3();
		mp3.viewPhoto();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mp3Test mp3Test = new Mp3Test();
		
		MyMp3 mp3Tony = new TonyMp3();
		mp3Test.test(mp3Tony);
		
		MyMp3 mp3Apple = new AppleMp3();
		mp3Test.test(mp3Apple);
	}

}
