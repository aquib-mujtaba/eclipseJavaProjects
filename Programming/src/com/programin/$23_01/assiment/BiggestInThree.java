package com.programin.$23_01.assiment;

import java.util.Scanner;

public class BiggestInThree {

	public static void main(String[] args) {
		System.out.println("Enter Your number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		sc.close();
		int rs = getBiggest(x, y, z);
		System.out.println("Biggest number aming these is " + rs);
	}

	private static int getBiggest(int x, int y, int z) {
		int r = 0;
		if (x > y && x > z) {
			r = x;
		} else if (y > z && y > x) {
			r = y;
		} else {
			r = z;
		}
		return r;
	}
}
