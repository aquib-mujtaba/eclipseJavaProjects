package com.coding;

import java.util.Scanner;

public class Amicable {
	public static void main(String[] aths) {
		int big_total = 0;
		int num;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (getAmicable(i, num)) {
				big_total += i;
			}
		}
		System.out.println(big_total);

	}

	static boolean getAmicable(int a, int n) {
		int sum = 0, summ = 0;
		for (int i = 1; i <= a / 2; i++) {
			if (a % i == 0) {
				sum += i;
			}
		}
		for (int i = 1; i <= sum / 2; i++) {
			if (sum % i == 0) {
				summ += i;
			}
		}
		if (sum <= n && summ <= n) {
			if (sum == summ)
				return true;
		}
		return false;
	}
}
