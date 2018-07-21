package com.programin.$22_01.deviserCount;

import java.util.Scanner;

public class Deviser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int x = sc.nextInt();
		sc.close();
		int r = getDeviser(x);
		System.out.println("Total deviser of " + x + " =" + r);
	}

	private static int getDeviser(int x) {
		/*
		 * int count = 1, i = 1; while (i <= x / 2) { if (x % i == 0) { count++; } i++;
		 * }
		 */
		/*
		 * int count = 1; for (int i = 1; i <= x / 2; i++) { if (x % i == 0) { count++;
		 * } }
		 */
		int count = 0, i = 1;
		do {
			count++;
			i++;
		} while (i <= x / 2);
		return count;
	}
}
