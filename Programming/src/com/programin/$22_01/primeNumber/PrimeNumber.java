package com.programin.$22_01.primeNumber;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int x = sc.nextInt();
		sc.close();
		boolean rs = isPrime(x);
		if (rs) {
			System.out.println("number is prime");
		} else {
			System.out.println("Not prime number");
		}

	}

	private static boolean isPrime(int x) {

		/*
		 * int count = 1; for (int i = 1; i <= x / 2; i++) { if (x % i == 0) { count++;
		 * } } return count == 2; }
		 */

		int i = 2;
		while (i <= x / 2) {
			if (x % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}
}