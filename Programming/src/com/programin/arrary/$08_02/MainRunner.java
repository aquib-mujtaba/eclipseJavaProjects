package com.programin.$08_02;

public class MainRunner {

	public static void main(String[] args) {
		int a[] = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = 9 - i;
		}
		for (int i = 0; i < a.length; i++) {
			a[i] = a[9 - i];
		}
		for (int i : a) {
			System.out.println(i);
		}
	}

}
