package com.programin.arrary.$19_02.ContWords;

import java.util.Scanner;

public class HowManyWord {

	public static void main(String[] args) {
		System.out.println("Enter your Sentence");
		String s = new Scanner(System.in).nextLine();
		char ch[] = s.toCharArray();
		int wc = 0;
		for (int i = 0; i < ch.length; i++) {
			if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {
				wc++;
			}
		}
		System.out.println("Total world present inside in it=" + wc);
	}

}
