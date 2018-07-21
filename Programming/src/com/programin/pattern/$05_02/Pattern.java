package com.programin.pattern.$05_02;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		System.out.println("Enter the Value of Row");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
