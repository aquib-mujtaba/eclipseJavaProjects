package com.programin.$26_01.assig;

import java.util.Scanner;

public class PrimeNumbers1toN {

	public static void main(String[] args) {
		System.out.println("Enter value of N");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		for (int x = 1; x <= n; x++) {
			if (isPrime(x)) {
				System.out.println(x);
			}
		}
	}

	private static boolean isPrime(int x) {
		int i = 2;
		while (i <= x / 2) {
			if (x % i == 0)
				return false;
			i++;
		}
		return true;
	}
}
