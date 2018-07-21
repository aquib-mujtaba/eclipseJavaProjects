package com.programin.arrary.$20_02.Q48;

import java.util.Scanner;

public class ReverseLetter {
	public static void main(String[] args) {
		System.out.println("Enter your Sentence");
		String s = new Scanner(System.in).nextLine();
		char ch[] = s.toCharArray();
		String rs = " ";
		for (int i = 0; i < ch.length; i++) {
			int k = i;
			while (i < ch.length && ch[i] != ' ') {
				i++;
			}
			int j = i - 1;
			while (j >= k) {
				rs = rs + ch[j];
				j--;
			}
			if (i < ch.length) {
				rs = rs + ch[i];
			}
			System.out.println(i);
		}
		System.out.println(rs);
	}

}
