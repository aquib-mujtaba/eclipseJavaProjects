package com.programin.$23_01;

import java.util.Scanner;

public class CountEvenOddDigits2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = sc.nextInt();
		sc.close();
		int r = countOddEven(n);
		System.out.println("Total even digits in " + n + " is=" + r);

	}

	private static int countOddEven(int n) {
		int edc = 0;
		do {
			int x = n % 10;
			if (x % 2 == 0) {
				edc++;
			}
			n = n / 10;
		} while (n != 0);

		return edc;
	}

}
