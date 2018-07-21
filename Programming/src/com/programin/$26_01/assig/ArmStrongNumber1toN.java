package com.programin.$26_01.assig;

import java.util.Scanner;

public class ArmStrongNumber1toN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value Of N");
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			if (isArmStrong(i)) {
				System.out.println("ArmStronNumber =" + i);
			}
		}
	}

	private static boolean isArmStrong(int i) {
		int sum = 0, temp = i;
		int c = count(i);
		while (temp != 0) {
			int r = temp % 10;
			sum = sum + pow(r, c);
			temp = temp / 10;
		}
		return i == sum;
	}

	private static int pow(int r, int c) {
		int pw = 1;
		while (c > 0) {
			pw = pw * r;
			c--;
		}
		return pw;
	}

	private static int count(int i) {
		int count = 0;
		while (i != 0) {
			i = i / 10;
			count++;
		}
		return count;
	}
}
