package com.programin.$26_01.assig;

import java.util.Scanner;

public class HappyNumber1toN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of N");
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			if (isHappyNumber(i))
				System.out.println("Happy number is=" + i);
		}
	}

	private static boolean isHappyNumber(int i) {

		while (i > 9) {
			i = squrOfDigits(i);
		}
		return i == 1 || i == 7;
	}

	private static int squrOfDigits(int i) {
		int s = 0;
		do {
			int r = i % 10;
			s = s + r * r;
			i = i / 10;
		} while (i != 0);
		return s;
	}
}
