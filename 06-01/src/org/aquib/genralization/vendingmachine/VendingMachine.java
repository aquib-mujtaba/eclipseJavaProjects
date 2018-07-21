package org.aquib.genralization.vendingmachine;

import java.util.Scanner;

public class VendingMachine {
	Bevrage gives() {
		System.out.println("Enetr Your choise[1] for coffe, [2] for milk,[3] for Tea ");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		if (ch == 1) {
			Cofee c = new Cofee();
			return c;
		}
		if (ch == 2) {
			Tea t = new Tea();
			return t;
		}
		if (ch == 1) {
			Milk m = new Milk();
			return m;
		} else {
			System.out.println("Make correct choise");
			return null;
		}
	}
}
