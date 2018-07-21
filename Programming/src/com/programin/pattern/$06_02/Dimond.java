package com.programin.$06_02;

import java.util.Arrays;

public class Dimond {

	public static void main(String[] args) {
		/*
		 * int n = 7, st = 1, sp = n / 2; for (int i = 1; i <= n; i++) { for (int j = 1;
		 * j <= sp; j++) { System.out.print("  "); } for (int j = 1; j <= st; j++) { //
		 * System.out.print("* "); System.out.print(j + " "); // System.out.print(j % 2
		 * + " "); // if (j % 2 == 0) { // System.out.print("*"); // } else { //
		 * System.out.print(j / 2 + 1); // } } if (i <= n / 2) { st = st + 2; sp--; }
		 * else { sp++; st = st - 2; } System.out.println(); }
		 */

		/*
		 * int n = 0;
		 * 
		 * System.out.print("Enter an odd number:"); Scanner scan = new
		 * Scanner(System.in); n = scan.nextInt(); int s = 1, sp = n / 2; for (int i =
		 * 1; i <= n; i++) { for (int j = 1; j <= sp; j++) { System.out.print("_"); }
		 * for (int k = 1; k <= s; k++) { System.out.print("*"); } if (i <= n / 2) {
		 * sp--; s += 2; } else { sp++; s -= 2; } System.out.println(); }
		 */

		int a[] = { 5, 4, 2, 6, 8, 9, 1, 3, 10, 7 };

		// Write your line here between the start and end comments
		// start

		Arrays.sort(a);

		// end

		System.out.println("The output is:");
		for (int i = 0; i < 10; i++)
			System.out.println(a[i]);

	}

}
