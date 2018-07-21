package com.programin.$05_02.assig;

public class Pattern11 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(i % 2 + " ");
			}
			System.out.println();
		}
	}

}
