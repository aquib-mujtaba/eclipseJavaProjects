package com.aquib.example;

//Java code for using this() to 
//invoke current class constructor
class Test {
	int a;
	int b;

	// Default constructor
	Test() {

		System.out.println("Inside  default constructor \n");
	}

	// Parameterized constructor

	Test(int a, int b) {
		this();
		this.a = a;
		this.b = b;
		System.out.println("Inside parameterized constructor");
	}

	public static void main(String[] args) {
		Test object = new Test(10, 20);
	}
}