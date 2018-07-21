package com.programin.arrary.$20_02.Q49;

import java.util.Scanner;

public class ReverseWords {
	public static void main(String[] args) {
		System.out.println("Enter your Sentence");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		char ch[] = st.toCharArray();
		String rv = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			int k = i;
			while (i >= 0 && ch[i] != ' ') {
				i--;
			}
			int j = i + 1;
			while (j <= k) {
				rv = rv + ch[j];
				j++;
			}
			if (i > 0)
				rv = rv + ch[i];
		}
		System.out.println(rv);
	}
}
