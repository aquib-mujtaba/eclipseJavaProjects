package com.programin.$18_01.check_age;

import java.util.Scanner;

public class Person {
	public static void main(String[] args) {
		System.out.println("Enter Your age ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		sc.close();
		/*
		 * if (age >= 18) { System.out.println("You are eligible to vote");
		 * 
		 * } else { System.out.println("you are not eligible"); }
		 */
		boolean rs = checkAge(age);
		if (rs) {
			System.out.println("You are eligible");
		} else {
			System.out.println("You are not Eligibe");
		}
	}

	private static boolean checkAge(int age) {
		return age >= 18;
	}
}