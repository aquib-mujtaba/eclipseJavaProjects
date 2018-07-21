package com.programin.example;

public class Exceptionn {

	public static void main(String[] args) {
		int n = 0;
		try {
			int v = 10 / n;
		} catch (Exception e) {
		} finally {
			System.out.println("in finally");
		}
		System.out.println(" outside cath");
	}

}
