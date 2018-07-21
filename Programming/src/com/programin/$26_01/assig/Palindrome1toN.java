package com.programin.$26_01.assig;

import java.util.Scanner;

public class Palindrome1toN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of N");
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			if (isPalindromeNumber(i))
				System.out.println("Palindrome number is=" + i);
		}
	}

	private static boolean isPalindromeNumber(int i) {
		return i == reverse(i);
	}

	private static int reverse(int i) {
		int rvrs = 0;
		do {
			int r = i % 10;
			rvrs = rvrs * 10 + r;
			i = i / 10;
		} while (i != 0);

		return rvrs;
	}

}
