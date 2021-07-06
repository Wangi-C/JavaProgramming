package com.swclass;

public class Book {
	private String title;
	private int price;
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	//기존(Object클래스)의 equals()를 Book클래스에 맞게 재정의 했다.
	public boolean equals(Object object) {
		if(object instanceof Book) {
			Book book = (Book) object;
			
			return (this.toString()).equals(book.toString());
		}
		return false;
	}
	
	@Override
	public String toString() {
		return this.title + this.price;
	}
}
