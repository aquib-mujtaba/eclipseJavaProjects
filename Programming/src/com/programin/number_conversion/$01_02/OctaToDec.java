package com.programin.$01_02;

import java.util.Scanner;

public class OctaToDec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int x = sc.nextInt();
		int r = octatoDec(x);
		System.out.println("Binory Number =" + r);
	}

	static int octatoDec(int b) {
		int p = 0, sum = 0;
		while (b != 0) {
			int r = b % 10;
			sum = sum + pow(8, p) * r;
			p++;
			b = b / 10;
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