package com.programin.$26_01.assig;

import java.util.Scanner;

public class CountBits1toN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of N");
		int n = sc.nextInt();
		sc.close();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + countBits(i);
		}
		System.out.println("Total numbers of 1's =" + sum);
	}

	private static int countBits(int i) {
		int count = 0;
		while (i != 0) {
			int r = i % 10;
			if (r == 1) {
				count++;
			}
			i = i / 10;
		}
		return count;
	}

}
