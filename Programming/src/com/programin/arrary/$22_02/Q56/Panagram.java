package com.programin.arrary.$22_02.Q56;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		System.out.println("Enter your Sentence");
		String st = new Scanner(System.in).nextLine();

		if (isPanagram(st)) {
			System.out.println("Its Panagram ");
		} else {
			System.out.println("not palangram");
		}
	}

	private static boolean isPanagram(String st) {
		if (st.length() < 26) {
			return false;
		}
		int c[] = new int[26];
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch >= 65 && ch <= 90) {
				c[ch - 65]++;
			} else if (ch >= 97 && ch <= 122) {
				c[ch - 97]++;
			}
		}
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 0) {
				return false;
			}
		}
		return true;
	}

}
