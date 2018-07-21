package com.programin.$23_01.assiment;

import java.util.Scanner;

public class SpecialNumber {
	public static void main(String[] args) {
		System.out.println("Enter Your number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		boolean rs = isSpecial(x);
		if (rs) {
			System.out.println(" Number is special number ");
		} else {
			System.out.println("Number is not Special ");
		}
	}

	private static boolean isSpecial(int x) {
		int f = x / 10;
		int s = x % 10;
		int sum = (f * s) + (f + s);
		return x == sum;
	}

}
