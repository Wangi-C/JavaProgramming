package com.sitemember;

public class MemberNumMaker {
	private String memberNum;
	private int num;
	private String area;
	
	public static Area infor = new Area();
	
	MemberNumMaker(Person one) {
		String address = one.getAddress();
		
		if (address.indexOf("����") != -1) {
			infor.setSeoulNum();
			num = infor.getSeoulNum();
			area = infor.getSeoul();
			
			memberNum = area + num;
		} else if (address.indexOf("�λ�") != -1) {
			infor.setBusanNum();
			num = infor.getBusanNum();
			area = infor.getBusan();
			
			memberNum = area + num;
		} else if (address.indexOf("�ƻ�") != -1) {
			infor.setAsanNum();
			num = infor.getAsanNum();
			area = infor.getAsan();
			
			memberNum = area + num;
		}
	}

	public String toString() {
		return memberNum;
	}
}
