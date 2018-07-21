package com.programin.$05_02.assig;

public class Pattern8 {

	public static void main(String[] args) {
		int n = 5, k = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
	}

}
