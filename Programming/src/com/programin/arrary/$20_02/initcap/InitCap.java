package com.programin.arrary.$20_02.initcap;

import java.util.Scanner;

public class InitCap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Sentence");
		String st = sc.nextLine();
		String s = initcap(st);
		System.out.println(s);
	}

	private static String initcap(String st) {
		char ch[] = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {
				if (ch[i] >= 'a' && ch[i] <= 'z') {
					ch[i] = (char) (ch[i] - 32);
				}
			} else {
				if (ch[i] >= 65 && ch[i] <= 90) {
					ch[i] = (char) (ch[i] + 32);
				}
			}
		}

		// Charecter Array To String Arrary
		/*
		 * st = " "; for (int i = 0; i < ch.length; i++) { st = st + ch[i]; }
		 */
		st = new String(ch);
		return st;
	}

}
