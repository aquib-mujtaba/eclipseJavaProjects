package com.aquib.override2;

public class Child extends Parrent {
	@Override
	void m() {
		System.out.println("Method of Child");
		super.m();
	}

	int sal = 2;

	int m1() {
		System.out.println("2nd Method of the class");
		return 2;
	}
}
