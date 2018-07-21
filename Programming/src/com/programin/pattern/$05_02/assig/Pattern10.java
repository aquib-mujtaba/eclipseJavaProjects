package com.programin.$05_02.assig;

public class Pattern10 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = i; j <= 5; j++) {
				System.out.print(i % 2);
			}
			System.out.println();
		}
	}
}
