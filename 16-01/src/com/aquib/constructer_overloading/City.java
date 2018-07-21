package com.aquib.constructer_overloading;

public class City {
	int pinCode;
	String name;

	public City() {

	}

	public City(int pinCode) {
		this.pinCode = pinCode;
	}

	public City(String name) {
		this.name = name;
	}

	public City(int pinCode, String name) {
		this.name = name;
		this.pinCode = pinCode;
	}
}
