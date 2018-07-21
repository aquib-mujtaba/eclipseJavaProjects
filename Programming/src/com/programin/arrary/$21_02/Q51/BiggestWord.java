package com.programin.$21_02.Q51;

import java.util.Scanner;

public class BiggestWord {

	public static void main(String[] args) {
		System.out.println("Enter your Sentence");
		String s = new Scanner(System.in).nextLine();
		char ch[] = s.toCharArray();
		String bg = "";
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			String st = "";
			while (i < ch.length && ch[i] != ' ') {
				st = st + ch[i];
				i++;
			}
			if (st.length() > bg.length()) {
				bg = st;
			}
		}
		System.out.println("Biggest Word=" + bg);
		System.out.println("Word length=" + bg.length());
	}
}
