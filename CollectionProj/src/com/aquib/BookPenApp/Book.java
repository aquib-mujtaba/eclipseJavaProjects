package com.aquib.BookPenApp;

public class Book {
	int bid;
	String bname;
	int price;

	public Book(int bid, String bname, int price) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", price=" + price + "]";
	}

}
