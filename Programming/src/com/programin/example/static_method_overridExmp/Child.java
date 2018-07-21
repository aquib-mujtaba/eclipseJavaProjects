package com.programin.example.static_method_overridExmp;

public class Child extends Parrent {

	public static void display() {
		System.out.println("static method from Derived");
	}

	// Static is added here (Causes Compiler Error)
	public void print() {
		System.out.println(" non-Static method from Derived");
	}

}
