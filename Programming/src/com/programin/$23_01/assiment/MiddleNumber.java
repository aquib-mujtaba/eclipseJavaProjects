package com.programin.$23_01.assiment;

import java.util.Scanner;

public class MiddleNumber {
	public static void main(String[] args) {
		System.out.println("Enter Your number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		sc.close();
		int rs = getMiddleNumber(x, y, z);
		System.out.println("Middle number among these is " + rs);

	}

	private static int getMiddleNumber(int x, int y, int z) {
		int r;
		if ((x > y && y > z) && (z > y && y > x)) {
			r = y;
			System.out.println("---1st----" + r);
		} else if ((y > x && x > z) && (z > x && x > y)) {
			r = y;
			System.out.println("--2nd-----" + r);
		} else {
			r = z;
			System.out.println("-----last--" + r);
		}
		return r;
	}

}
