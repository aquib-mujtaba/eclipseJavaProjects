package com.programin.$24_01;

public class DevisibleBy3_5 {
	public static void main(String[] args) {

		for (int x = 1; x <= 100; x++) {
			if (x % 3 == 0 && x % 5 == 0) {
				System.out.println(x + "=Sanju weds gita");
			} else if (x % 3 == 0) {
				System.out.println(x + "=sanju");
			} else if (x % 5 == 0) {
				System.out.println(x + "=Gita");
			}
		}
	}
}
