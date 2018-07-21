package org.aquib.hotel;

import java.util.Scanner;

public class Hotel {
	Food serve() {
		System.out.println("Enter your choise of food");
		Scanner sc = new Scanner(System.in);
		String type = sc.nextLine();
		sc.close();
		if (type.equalsIgnoreCase("Edli")) {
			Edli e = new Edli();
			return e;

		} else if (type.equalsIgnoreCase("Dosha")) {
			Dosha d = new Dosha();
			return d;
		} else if (type.equalsIgnoreCase("Biryani")) {
			Biryani b = new Biryani();
			return b;
		} else if (type.equalsIgnoreCase("Roti")) {
			Roti r = new Roti();
			return r;
		} else {
			System.out.println("Enter correct choise");
			return null;
		}
	}
}
