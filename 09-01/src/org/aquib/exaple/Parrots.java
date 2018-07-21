package org.aquib.exaple;

import java.util.Scanner;

public class Parrots {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		sc.close();
		if (age < 22) {
			System.out.println("Go and study");
		} else if (age > 21 && age < 27) {
			System.out.println("find job");
		} else if (age > 25 && age < 51) {
			System.out.println("Work hard");
		} else if (age > 51) {
			System.out.println("Go to himalyay");
		}
	}

}
