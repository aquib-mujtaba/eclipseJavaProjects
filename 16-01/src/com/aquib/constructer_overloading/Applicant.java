package com.aquib.constructer_overloading;

public class Applicant {
	String name;
	int sal;
	boolean isMarried;

	public Applicant() {
		this.name = "Aquib";
		this.sal = 20000;
		this.isMarried = false;
	}

	public Applicant(int sal) {
		this.sal = sal;
	}

	public Applicant(String name) {
		this.name = name;
	}

	public Applicant(boolean isMarried) {
		this.isMarried = isMarried;

	}

	public Applicant(String name, int sal, boolean isMarried) {
		this.isMarried = isMarried;
		this.name = name;
		this.sal = sal;
	}

}
