package com.programin.$26_01.assig;

import java.util.Scanner;

public class Factorial1ToN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of N");
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			fact(i);
		}

	}

	private static void fact(int n) {
		int f = 1, i = n;
		while (i > 0) {
			f = f * i;
			i--;
		}
		System.out.println(n + "!=" + f);
	}

}
