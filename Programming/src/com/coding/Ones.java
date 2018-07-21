package com.coding;

import java.util.Scanner;

public class Ones {
	public static void main(String[] args) {
		System.out.println("Enter the Min value:");
		Scanner sc1 = new Scanner(System.in);
		long min = sc1.nextLong();

		System.out.println("Enter the Maximum value:");
		long max = sc1.nextLong();
		int count = 0;
		for (int i = (int) min; i <= (int) max; i++) {
			int t = i;
			while (t != 0) {
				if (t % 10 == 1) {
					count++;
				}
				t = t / 10;
			}

		}
		System.out.println("Total sum of count of 1s:");
		System.out.println(count);

	}

}
