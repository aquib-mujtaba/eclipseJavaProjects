package com.programin.arrary.$22_02.Q57;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first Sentence");
		String f = sc.nextLine();
		System.out.println("Enter your Secound Sentence");
		String s = sc.nextLine();
		if (isAnagram(f, s)) {
			System.out.println("Its Anagram");
		} else {
			System.out.println("Not Anagram");
		}
	}

	private static boolean isAnagram(String f, String s) {
		int c1[] = countOfOccurence(f);
		int c2[] = countOfOccurence(s);
		for (int i = 0; i < c2.length; i++) {
			if (c1[i] != c2[i]) {
				return false;
			}
		}
		return true;
	}

	private static int[] countOfOccurence(String s) {
		int count[] = new int[26];
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90) {
				count[ch[i] - 65]++;
			} else if (ch[i] >= 97 && ch[i] <= 122) {
				count[ch[i] - 97]++;
			}
		}
		return count;
	}
}
