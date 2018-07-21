package com.programin.$22_01.assiments;

import java.util.Scanner;

public class EvenNumberSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Upper Bowndery");
		int b = sc.nextInt();
		int r = getSum(b);
		System.out.println("Sum of even numbers till " + b + " is=" + r);
	}

	private static int getSum(int b) {
		int sum = 0;
		for (int i = 1; i <= b; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}
}
