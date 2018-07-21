package com.programin.$26_01;

import java.util.Scanner;

public class IsHappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number");
		int n = sc.nextInt();
		sc.close();
		boolean rs = isHappyNumbers(n);
		if (rs) {
			System.out.println(n + " Is Happy Number");
		} else
			System.out.println(n + " Not Happy Number");
	}

	private static boolean isHappyNumbers(int n) {
		while (n > 9) {
			n = sumOfSqrOfNumber(n);
		}
		return n == 1 || n == 7;
	}

	private static int sumOfSqrOfNumber(int n) {
		int sum = 0;
		do {
			int r = n % 10;
			sum = sum + r * r;
			n = n / 10;
		} while (n != 0);
		return sum;
	}
}
