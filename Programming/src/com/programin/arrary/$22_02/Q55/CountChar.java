package com.programin.arrary.$22_02.Q55;

import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) {
		System.out.println("Enter your sentence");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char ch[] = s.toCharArray();
		int count[] = new int[26];
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90) {
				count[ch[i] - 65]++;
			} else if (ch[i] >= 97 && ch[i] <= 122) {
				count[ch[i] - 97]++;
			}
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				System.out.println((char) (i + 65) + "=present " + count[i]);
			}
		}

	}
}
