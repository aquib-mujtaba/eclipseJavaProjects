package com.programin.$24_01;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		System.out.println("Enter Your number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		boolean rs = isStrong(x);
		if (rs) {
			System.out.println("Number is srtong mumber");
		} else {
			System.out.println("Not strong number");
		}
	}

	private static boolean isStrong(int x) {
		int t = x, sum = 0;
		while (t != 0) {
			int r = t % 10;
			sum = sum + fact(r);
			t = t / 10;
		}
		return sum == x;
	}

	private static int fact(int t) {
		int f = 1;
		while (t > 1) {
			f = f * t;
			t--;
		}
		return f;
	}
}
