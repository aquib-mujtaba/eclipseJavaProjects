package com.programin.$22_01.assiments;

import java.util.Scanner;

public class PerfectNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = sc.nextInt();
		boolean rs = isPerfect(n);
		if (rs) {
			System.out.println("Number is perfect number");
		} else {
			System.out.println("Number is not perfect number");
		}
	}

	private static boolean isPerfect(int x) {
		int sum = 0;
		for (int i = 1; i <= x / 2; i++) {
			if (x % i == 0) {
				sum = sum + i;
				System.out.println(i);
			}
		}
		return sum == x;
	}

}
