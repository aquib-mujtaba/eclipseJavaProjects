package com.programin.$23_01;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = sc.nextInt();
		sc.close();
		int r = countDigit(n);
		System.out.println("Total digits in " + n + " is=" + r);
	}

	private static int countDigit(int n) {
		/*
		 * int count = 0; do { count++; n = n / 10; } while (n != 0); return count;
		 */
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		return count;

	}
}
