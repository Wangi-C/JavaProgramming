package com.sitemember;

public class Area {
	private String seoul = "A";
	private String busan = "B";
	private String asan = "C";
	private int seoulNum = 0;
	private int busanNum = 0;
	private int asanNum = 0;
	
	public String getSeoul() {
		return seoul;
	}
	public String getBusan() {
		return busan;
	}
	public String getAsan() {
		return asan;
	}
	public int getSeoulNum() {
		return seoulNum;
	}
	public int getBusanNum() {
		return busanNum;
	}
	public int getAsanNum() {
		return asanNum;
	}
	public void setSeoulNum() {
		// TODO Auto-generated method stub
		seoulNum++;
	}
	public void setBusanNum() {
		// TODO Auto-generated method stub
		busanNum++;
	}
	public void setAsanNum() {
		// TODO Auto-generated method stub
		asanNum++;
	}
	
}
