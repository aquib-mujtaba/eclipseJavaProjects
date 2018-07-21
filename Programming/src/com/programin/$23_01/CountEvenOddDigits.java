package com.programin.$23_01;

import java.util.Scanner;

public class CountEvenOddDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = sc.nextInt();
		sc.close();
		int edc = 0, odc = 0;
		do {
			int x = n % 10;
			if (x % 2 == 0) {
				edc++;
			} else {
				odc++;
			}
			n = n / 10;
		} while (n != 0);
		System.out.println("Total even digits is=" + edc + "\n Total odd digits =" + odc);
	}
}
