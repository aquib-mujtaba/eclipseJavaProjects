package com.aquib.BookPenApp;

public class Pen {
	int pid;
	String name;
	int price;

	public Pen(int id, String name, int price) {
		super();
		this.pid = id;
		this.name = name;
		this.price = price;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pen [id=" + pid + ", name=" + name + ", price=" + price + "]";
	}
}
