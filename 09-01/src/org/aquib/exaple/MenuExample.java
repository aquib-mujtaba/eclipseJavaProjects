package org.aquib.exaple;

import java.util.Scanner;

public class MenuExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choise Tea| Cofee ");
		String ch = sc.nextLine();
		sc.close();
		if (ch.equalsIgnoreCase("cofee")) {
			System.out.println("Latee");
			System.out.println("Capachino");
			System.out.println("Cold cofeee");
		} else if (ch.equalsIgnoreCase("tea")) {
			System.out.println("Lemon tea");
			System.out.println("Ginger tea");
			System.out.println("Mashala tea");
			System.out.println("Green tea");
		} else {
			System.out.println("Wrog input");
		}
	}
}
