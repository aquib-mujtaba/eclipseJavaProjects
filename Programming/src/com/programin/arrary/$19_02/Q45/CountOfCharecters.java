package com.programin.arrary.$19_02.Q45;

import java.util.Scanner;

public class CountOfCharecters {

	public static void main(String[] args) {
		System.out.println("Enter your Sentence");
		String s = new Scanner(System.in).nextLine();
		int cl = 0, sl = 0, vl = 0, cons = 0, dig = 0, spcl = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				cl++;
				if (ch == 'A' || ch == 'E' || ch == 'O' || ch == 'I' || ch == 'U') {
					vl++;
				} else {
					cons++;
				}
			} else if (ch >= 'a' && ch <= 'z') {
				sl++;
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vl++;
				} else {
					cons++;
				}
			} else if (ch >= '0' && ch <= '9') {
				dig++;
			} else {
				spcl++;
			}
		}
		System.out.println("Capital letter Present inside the Strig is=" + cl);
		System.out.println("Small letter Present inside the Strig is=" + sl);
		System.out.println("Consonnents letter Present inside the Strig is=" + cons);
		System.out.println("Vowel Present inside the Strig is=" + vl);
		System.out.println("Digits Present inside the Strig is=" + dig);
		System.out.println("Special charecter Present inside the Strig is=" + spcl);
	}
}
