package com.aquib.example;

public class Mobile {
	String model = "OnePluse";

	void call() {
		// this.model = "OnePluse";
		System.out.println("Calling by this " + this.model);
	}

	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.call();
		m.model = "Samsung S8";
		m.call();
	}

}
