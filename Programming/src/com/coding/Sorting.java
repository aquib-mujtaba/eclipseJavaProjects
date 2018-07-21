package com.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter a string:\n");
		String str;
		str = br.readLine();
		str = sorted(str);
		// end
		System.out.println("Sorted string:\n" + str);

	}

	private static String sorted(String str) {
		char ch[] = str.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
	}

}
