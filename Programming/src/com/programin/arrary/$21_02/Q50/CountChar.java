package com.programin.$21_02.Q50;

import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) {
		System.out.println("Enter your Sentence");
		String s = new Scanner(System.in).nextLine();
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			String st = "";
			while (i < ch.length && ch[i] != ' ') {
				st = st + ch[i];
				i++;
				count++;
			}
			if (count > 0) {
				System.out.println(st + " = " + count);
			}

		}
	}

}
