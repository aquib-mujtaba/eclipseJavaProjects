package com.programin.$26_01;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number");
		int n = sc.nextInt();
		sc.close();
		int count = getSumOfDigits(n);
		System.out.println(n + " Has Sum of its digits =" + count);
	}

	private static int getSumOfDigits(int n) {
		int sum = 0;
		do {
			int r = n % 10;
			sum = sum + r;
			n = n / 10;
		} while (n != 0);
		return sum;
	}

}
