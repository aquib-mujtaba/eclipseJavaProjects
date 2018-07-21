package com.example.tostring;

public class Mobile {
	int price = 28999;
	String col = "red";
	String model = "OnePlus";

	@Override
	public String toString() {
		String s = "Model=" + this.model + " Price=" + this.price + " Colour=" + this.col;
		return s;
	}
}
