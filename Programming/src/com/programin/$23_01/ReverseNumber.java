package com.programin.$23_01;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = sc.nextInt();
		sc.close();
		int r = reverseNumber(n);
		System.out.println("Reverse of Number is= " + r);
	}

	private static int reverseNumber(int n) {
		int revers = 0;
		do {
			int r = n % 10;
			revers = revers * 10 + r;
			n = n / 10;
		} while (n != 0);
		return revers;
	}

}
