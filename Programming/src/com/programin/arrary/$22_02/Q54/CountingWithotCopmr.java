package com.programin.arrary.$22_02.Q54;

import java.util.Scanner;

public class CountingWithotCopmr {

	public static void main(String[] args) {
		int cout[] = new int[128];
		System.out.println("Enter your Sentence");
		String st = new Scanner(System.in).nextLine();
		char ch[] = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			cout[ch[i]]++;
		}
		for (int i = 0; i < cout.length; i++) {
			if (cout[i] != 0) {
				System.out.println((char) i + "= present=" + cout[i]);
			}
		}
	}

}
