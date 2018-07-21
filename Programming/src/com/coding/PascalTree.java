package com.coding;

import java.util.Scanner;

public class PascalTree {
	public static void main(String[] args) {
		int num = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number of rows for pascal triangle:");
		num = scan.nextInt();
		System.out.print("Pascal Triangle of " + num + " is:");
		System.out.println();
		int[][] m = new int[num][num];
		m[0][0] = 1;
		for (int i = 0; i < num; i++) {
			for (int j = i; j < num; j++) {
				System.out.print("_");
			}
			for (int j = 0; j <= i; j++) {
				if (i == 0 || j == 0) {
					m[i][j] = 1;
				} else
					m[i][j] = m[i - 1][j - 1] + m[i - 1][j];
				System.out.print(m[i][j] + "_");
			}
			System.out.println();
		}

	}

}
