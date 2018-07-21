package com.programin.example.string;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your 1st String");
		String s = sc.next();
		System.out.println("Entter your 2nd string");
		String s1 = sc.next();
		sc.close();
		String r = s + s1;
		String rv = "";
		for (int i = r.length() - 1; i >= 0; i--) {
			rv = rv + r.charAt(i);
		}
		if (r.equals(rv)) {
			System.out.println("Its palindrome");
		} else {
			System.out.println("Not palindrome");
		}

	}
}
