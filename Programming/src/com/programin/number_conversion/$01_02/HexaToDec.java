package com.programin.$01_02;

import java.util.Scanner;

public class HexaToDec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		String x = sc.next();
		int r = hexaToDec(x);
		System.out.println("Decial Number =" + r);
	}

	static int hexaToDec(String hx) {
		int p = 0, sum = 0, i = hx.length() - 1;
		while (i >= 0) {
			char ch = hx.charAt(i);
			i--;
			if (ch >= '0' && ch <= '9')
				sum = sum + (ch - 48) * pow(16, p);
			else if (ch >= 'a' && ch <= 'f')
				sum = sum + (ch - 87) * pow(16, p);
			else
				sum = sum + (ch - 55) * pow(16, p);

			p++;
		}
		return sum;
	}

	private static int pow(int i, int p) {
		int pw = 1;
		while (p > 0) {
			pw = pw * i;
			p--;
		}
		return pw;
	}
}
