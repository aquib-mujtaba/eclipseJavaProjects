package com.programin.$24_01;

import java.util.Scanner;

public class MultiplyPower {

	public static void main(String[] args) {
		System.out.println("Enter Your number And its Power");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		int rs = getPower(x, y);
		System.out.println("Power of " + x + "=" + rs);
	}

	private static int getPower(int x, int y) {
		int pw = 1;
		if (y > 1) {
			while (y > 0) {
				pw = pw * x;
				y--;
			}
		}
		return pw;
	}

}
