package com.programin.$22_01.multiplication;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number ");
		int n = sc.nextInt();
		display(n);
	}

	private static void display(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "*" + i + "=" + n * i);
		}
	}

}
