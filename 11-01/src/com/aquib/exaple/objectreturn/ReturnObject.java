package com.aquib.exaple.objectreturn;

import java.util.Scanner;

public class ReturnObject {
	Animal returnType() {
		// Random r = new Random();
		// int ch = r.nextInt(3);
		System.out.println("enter choice [0,1,2]");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		sc.close();
		if (ch == 0) {
			Cow c = new Cow();
			return c;
		} else if (ch == 1) {
			Dog d = new Dog();
			return d;
		} else if (ch == 2) {
			Tiger t = new Tiger();
			return t;
		} else {
			System.out.println("Somting Wrong here");
			return null;
		}
	}
}
