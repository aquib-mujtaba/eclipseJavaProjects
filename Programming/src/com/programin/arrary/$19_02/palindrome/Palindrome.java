package com.programin.arrary.$19_02.palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your sting");
		String s = sc.next();
		sc.close();
		if (isPalindrom(s)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

	private static boolean isPalindrom(String s) {
		String rv = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rv = rv + s.charAt(i);
		}
		System.out.println(rv);
		return rv.equalsIgnoreCase(s);
	}

}
