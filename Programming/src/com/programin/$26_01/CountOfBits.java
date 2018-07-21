package com.programin.$26_01;

import java.util.Scanner;

public class CountOfBits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number");
		int n = sc.nextInt();
		sc.close();
		int count = getCountOfBits(n);
		System.out.println(n + " Has Number of Bits=" + count);
	}

	private static int getCountOfBits(int n) {
		int count = 0;
		while (n != 0) {
			if (n % 2 == 1)
				count++;
			n = n / 2;
		}
		return count;
	}

}
