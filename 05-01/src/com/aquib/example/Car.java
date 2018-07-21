package com.aquib.example;

public class Car {
	String model;

	void display() {
		// System.out.println("This=" + this);
		this.model = "Alto";
		System.out.println(this.model);
	}

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.display();
		System.out.println("this is=" + c1.model);
		c1.model = "BMW";
		c1.display();
		System.out.println("C1=" + c1.model);
		/*
		 * Car c2 = new Car(); System.out.println("c2=" + c2); c2.display(); //
		 * c1.display();
		 */

	}

}
