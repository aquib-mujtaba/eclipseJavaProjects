package com.programin.$24_01;

import java.util.Scanner;

public class LeepYear {
	public static void main(String[] args) {
		System.out.println("Enter Your number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		boolean rs = isLeepYear(x);
		if (rs) {
			System.out.println("Year  is leeap year");
		} else {
			System.out.println("Not leap year");
		}
	}

	private static boolean isLeepYear(int x) {
		return x % 400 == 0 || (x % 4 == 0 && x % 100 != 0);
	}

}
