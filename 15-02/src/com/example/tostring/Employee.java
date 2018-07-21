package com.example.tostring;

public class Employee {
	private int id;
	private double sal;
	private String name;

	public void setId(int id) {
		this.id = id;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		String s = "Name=" + this.name + " Price=" + this.sal + " Id= " + this.id;
		return s;
	}
}
