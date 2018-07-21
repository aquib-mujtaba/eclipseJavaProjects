package com.programin.arrary.$20_02.Q49;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class statement_reverse {
	public static void main(String a[]) throws Exception {
		String strarr[]; // array which will hold splitted strings of the statement
		String st; // contains user input statement
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Statement:");
		st = br.readLine();
		char str[] = st.toCharArray();
		System.out.println("The reverse is:");
		int s = 0;
		for (int i = str.length - 1; i >= 0; i--) {
			if (str[i] == ' ' || i == 0) {
				s++;
			}
		}

		for (int i = str.length - 1; i >= 0; i--) {
			int k = i;
			while (str[i] != ' ' || i > 0) {
				i--;
			}
			int j = i + 1, z = 0; // h e l l o w o r l d
			while (j <= k) { // 0 1 2 3 456 7 8 9 10
				for (int x = j; x <= k; x++) {
					// strarr[z]=
				}
				z++;
			}
			/* write down your logic here */
			System.out.println(st);

		}

	}
}