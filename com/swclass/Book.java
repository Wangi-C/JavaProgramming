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
	//����(ObjectŬ����)�� equals()�� BookŬ������ �°� ������ �ߴ�.
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
