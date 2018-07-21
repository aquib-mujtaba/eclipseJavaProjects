package com.programin.arrary.$19_02.palindrome;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		System.out.println("Enter your Sting");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		if (isPalindrome(s)) {
			System.out.println("Your string is PAlindrome ");
		} else {
			System.out.println("Your string is Not palindrome");
		}
	}

	private static boolean isPalindrome(String s) {
		int i = 0;
		while (i < s.length() / 2) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
			i++;
		}
		return true;
	}
}
