package com.programin.arrary.$19_02.Q45;

import java.util.Scanner;

public class CountOfChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Sentance");
		int cl = 0, sm = 0, vl = 0, conso = 0, digitsc = 0, sp = 0;
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				cl++;
				if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
					vl++;
				} else
					conso++;

			} else if (ch >= 'a' && ch <= 'z') {
				sm++;
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vl++;
				} else {
					conso++;
				}
			} else if (ch >= '0' && ch <= '9') {
				digitsc++;
			} else {
				sp++;
			}
		}
		System.out.println("Number of Capital Latter=" + cl);
		System.out.println("Number of Small Latter=" + sm);
		System.out.println("Number of Vowel Latter=" + vl);
		System.out.println("Number of Consonnet Latter=" + conso);
		System.out.println("Number of Special Latter=" + sp);
		System.out.println("Number of Digits Latter=" + digitsc);
	}
}
