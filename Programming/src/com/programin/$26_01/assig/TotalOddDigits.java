package com.programin.$26_01.assig;

import java.util.Scanner;

public class TotalOddDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your number");
		int n = sc.nextInt();
		sc.close();
		int r = countOddDigits(n);
		System.out.println("Total odd digits in " + n + " is=" + r);
	}

	private static int countOddDigits(int n) {
		int cout = 0;
		while (n != 0) {
			if (n % 2 != 0)
				cout++;
			n = n / 10;
		}
		return cout;
	}
}
