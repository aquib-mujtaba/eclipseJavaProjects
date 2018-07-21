package com.programin.$22_01.assiments;

import java.util.Scanner;

public class DevesibleCountOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		System.out.println("Enter number till you want count of devisable numbers  ");
		int b = sc.nextInt();
		sc.close();
		int r = getCount(n, b);
		System.out.println("Count of devesible of " + n + " till " + b + " is=" + r);
	}

	private static int getCount(int n, int b) {
		int count = 0;
		for (int i = n; i <= b; i++) {
			if (i % n == 0) {
				count++;
			}
		}
		return count;
	}

}
