package com.programin.$24_01.assig;

import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int x = sc.nextInt();
		sc.close();
		for (int i = 1; i <= x; i++) {
			if (isArmStrong(i)) {
				System.out.println("Number is Arm Strong " + i);
			}
		}
	}

	private static boolean isArmStrong(int x) {
		int sum = 0, t = x;
		int c = cout(x);
		while (t != 0) {
			int r = t % 10;
			sum = sum + pow(r, c);
			t = t / 10;
		}
		return x == sum;
	}

	private static int pow(int n, int c) {
		int pw = 1;
		if (n > 0) {
			while (c > 0) {
				pw = pw * n;
				c--;
			}
		}
		return pw;
	}

	private static int cout(int x) {
		int count = 0;
		while (x != 0) {
			x = x / 10;
			count++;
		}
		return count;
	}
}
