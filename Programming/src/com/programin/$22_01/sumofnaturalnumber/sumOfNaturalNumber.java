package com.programin.$22_01.sumofnaturalnumber;

import java.util.Scanner;

public class sumOfNaturalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int s = getSum(n);
		System.out.println("Sum of " + n + " natural number is " + s);
	}

	private static int getSum(int n) {
		int sum = 0;
		/*
		 * while (n > 0) { sum = sum + n; n--; } return sum;
		 */
		/*
		 * for (int i = 1; i <= n; i++) { sum = sum + i; }
		 */
		/*
		 * int i = 1; while (i <= n) { sum = sum + i; i++; }
		 */
		for (int i = n; i >= 1; i--) {
			sum = sum + i;
		}
		return sum;
	}

}
