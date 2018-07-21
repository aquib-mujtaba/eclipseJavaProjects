package com.programin.arrary.$26_02.Q58;

import java.util.Scanner;

public class SumOfNumberInString {

	public static void main(String[] args) {
		System.out.println("Enter your String");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int sum = sumOfNumber(st);
		System.out.println("Sum of number is=" + sum);
	}

	private static int sumOfNumber(String st) {
		char ch[] = st.toCharArray();
		int sum = 0;
		for (int i = 0; i < ch.length; i++) {
			int no = 0;
			while (i < ch.length && ch[i] >= '0' && ch[i] <= '9') {
				no = no * 10 + (ch[i] - 48);
				i++;
			}
			sum = sum + no;
		}
		return sum;
	}
}
