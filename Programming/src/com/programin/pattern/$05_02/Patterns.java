package com.programin.$05_02;

public class Patterns {
	public static void main(String[] args) {
		int k = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				// System.out.print(k + " ");
				System.out.print(k % 2 + " ");

				k++;
			}
			System.out.println();
		}
	}
}
