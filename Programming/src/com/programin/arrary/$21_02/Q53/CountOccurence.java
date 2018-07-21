package com.programin.$21_02.Q53;

import java.util.Scanner;

public class CountOccurence {
	public static void main(String[] args) {
		System.out.println("Enter your Sentence");
		String s = new Scanner(System.in).nextLine();
		char ch[] = s.toCharArray();
		int n = ch.length;
		for (int i = 0; i < n; i++) {
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = ch[--n];
					j--;
				}
			}
			System.out.println(ch[i] + "---->" + count);
		}
	}
}
