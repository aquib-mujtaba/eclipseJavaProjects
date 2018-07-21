package com.aquib.demoapp;

public class Calculater {
	void add() {
		System.out.println("Sum is=" + 10 + 20);
	}

	void add(int a, int b) {
		System.out.println("Sum is=" + a + b);
	}

	void add(int a, double b) {
		System.out.println("Sum is=" + a + b);
	}

	void add(int a, int b, int c) {
		System.out.println("Sum is=" + a + b + c);
	}

	public static void main(String[] args) {
		Calculater ad = new Calculater();
		ad.add();
		ad.add(1, 5.3);
		ad.add(5, 6);
		ad.add(5, 7, 5);
	}
}