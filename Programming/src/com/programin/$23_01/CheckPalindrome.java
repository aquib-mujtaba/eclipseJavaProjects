package com.programin.$23_01;

import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = sc.nextInt();
		sc.close();
		boolean rs = checkPalindrome(n);
		if (rs) {
			System.out.println(n + " Number is palindrome");
		} else {
			System.out.println(n + " Is Not plindrome");
		}
	}

	private static boolean checkPalindrome(int n) {
		return n == reverseNumber(n);
	}

	private static int reverseNumber(int n) {
		int revers = 0;
		do {
			int r = n % 10;
			revers = revers * 10 + r;
			n = n / 10;
		} while (n != 0);
		return revers;
	}

}
