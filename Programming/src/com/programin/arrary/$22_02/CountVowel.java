package com.programin.arrary.$22_02;

import java.util.Scanner;

public class CountVowel {

	public static void main(String[] args) {
		System.out.println("Enter your Sentence");
		String s = new Scanner(System.in).nextLine();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A' || s.charAt(i) == 'a' || s.charAt(i) == 'E' || s.charAt(i) == 'e'
					|| s.charAt(i) == 'I' || s.charAt(i) == 'i' || s.charAt(i) == 'O' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u' || s.charAt(i) == 'U') {
				count++;
			}
		}
		System.out.println("Total vowels=" + count);
	}

}
