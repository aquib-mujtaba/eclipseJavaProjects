package com.programin.number_conversion;

import java.util.Scanner;

public class NumberConvertion {
	public static void main(String[] args) {
		// System.out.println("Enter the Number");
		// Scanner sc = new Scanner(System.in);
		// int x = sc.nextInt();
		int x = 10;
		String bn = getBinory(x);
		// int hexa = getHexa(x);
		String oct = getOcata();
		System.out.println("Binory of " + x + "=" + bn);
		// System.out.println("Hexadecimal of" + x + "=" + bn);
		System.out.println("Octa Decimal of " + " = " + oct);
		/*
		 * System.out.printf("OCTA decimal number of " + x + " is =" + "%o \n", x);
		 * System.out.printf("Hexa Decimal number of " + x + " is =" + "%x \n", x); //
		 * System.out.printf("Decimal number of " + x + " is =" + "%d \n", x);
		 */
	}

	private static int getHexa(int x) {
		return 0;
	}

	private static String getOcata() {
		int num;
		String oct = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		num = sc.nextInt();
		while (num != 0) {
			oct = num % 8 + oct;
			num = num / 8;
		}
		return oct;
	}

	private static String getBinory(int x) {
		String b = "";
		while (x != 0) {
			b = x % 2 + b;
			x = x / 2;
		}
		return b;
	}

}
