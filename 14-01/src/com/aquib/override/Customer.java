package com.aquib.override;

public class Customer {

	public static void main(String[] args) {
		Shop s = new Shop();
		Vegitable v = s.sell();
		if (v != null) {
			v.prepare();
		}
	}

}
