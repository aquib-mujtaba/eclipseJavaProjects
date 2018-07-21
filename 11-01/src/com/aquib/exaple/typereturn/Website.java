package com.aquib.exaple.typereturn;

import java.util.Scanner;

public class Website {
	Gift registerAndTakeGift() {
		// Random r = new Random();
		// int ch = r.nextInt(3);
		System.out.println("Enter choice [1,2,3]");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		sc.close();
		if (ch == 1) {
			Mobile m = new Mobile();
			return m;
		} else if (ch == 2) {
			Perfume p = new Perfume();
			return p;
		} else if (ch == 3) {
			Chocolate c = new Chocolate();
			return c;
		} else {
			System.out.println("Some problem");
			return null;
		}
	}
}
