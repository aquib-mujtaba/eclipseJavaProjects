package com.programin.arrary.$23_02.Q58;

import java.util.Scanner;

public class CheckSubString {
	public static void main(String[] args) {
		String st = "chitradurga is a fort city";
		System.out.println("Enter your Secound Sentence");
		String st2 = new Scanner(System.in).nextLine();
		if (check(st, st2)) {
			System.out.println("Sub string is present ");
		} else {
			System.out.println("Sub string is not present inside this sentence");
		}
	}

	private static boolean check(String Orgst, String sub) {
		char c1[] = Orgst.toCharArray();
		char c2[] = sub.toCharArray();
		for (int i = 0; i < c1.length; i++) {
			int j = 0, k = i;
			while (j < c2.length && k < c1.length && c1[k] == c2[j]) {
				j++;
				k++;
			}
			if (j == c2.length) {
				return true;
			}
		}
		return false;
	}
}
