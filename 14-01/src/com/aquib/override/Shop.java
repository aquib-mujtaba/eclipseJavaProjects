package com.aquib.override;

import java.util.Scanner;

public class Shop {
	Vegitable sell() {

		System.out.println("Enter your Choice [Potato|carrot|Chily]");
		Scanner sc = new Scanner(System.in);
		String ch = sc.next();
		sc.close();
		if (ch.equalsIgnoreCase("chilly")) {
			return new Chilly();
		} else if (ch.equalsIgnoreCase("Potato")) {
			return new Potato();
		} else if (ch.equalsIgnoreCase("carrot")) {
			return new Carrot();
		} else {
			System.out.println("Enter Correct choice");
			return null;
		}
	}
}
