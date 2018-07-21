package com.aquib.studentDetails;

public class Student {
	private String name;
	private int id;
	private double per;
	private int m[];

	public Student(String name, int id, int[] m) {
		this.name = name;
		this.id = id;
		this.per = per;
		this.m = m;
		per = calculatePer(m);
	}

	public double getPer() {
		return per;
	}

	private double calculatePer(int m[]) {
		double total = 0;
		for (int i = 0; i < m.length; i++) {
			total = total + m[i];
		}
		return total / m.length;
	}

	public String getResult() {
		for (int i = 0; i < m.length; i++) {
			if (m[i] < 35) {
				return "FAIL";
			}
		}
		if (per >= 85) {
			return "Distinction";
		} else if (per >= 60) {
			return "FIRST Division";
		} else if (per >= 50) {
			return "Secound Division";
		} else {
			return "pass";
		}
	}

	@Override
	public String toString() {
		String st = "[" + id + "," + name + ",";
		for (int i = 0; i < m.length; i++) {
			st = st + m[i] + ",";
		}
		st = st + per + "," + getResult() + " ] ";
		return st;
	}
}
