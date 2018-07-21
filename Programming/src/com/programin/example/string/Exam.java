package com.programin.example.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exam {
	//
	// public static String ones[] = { "one", "two", "three", "four", "five", "six",
	// " seven", "eight", "nine", "ten",
	// "eleven", "twelve", "thirteen", "forteen", "fifteen", "sixteen", "seventeen",
	// "eighteen", "ninteen" };
	// public static String tens[] = { "twenty", "thirty", "fourty", "fifty",
	// "sixty", "seventy", "eighty", "ninty" };
	//
	// public static void main(String a[]) throws Exception {
	// Scanner sc = new Scanner(System.in);
	// int num, rem, t;
	//
	// System.out.println("Enter the number:");
	// num = sc.nextInt();
	// System.out.println("Entered number is:");
	// /* write down your logic here */
	// if (num < 20)
	// System.out.println(ones[num - 1]);
	// else {
	// int r = num % 10;
	// int f = num / 10;
	// System.out.println(tens[f - 2] + " " + ones[r - 1]);
	// }
	// }

	/*
	 * public static void main(String[] args) throws IOException {
	 * 
	 * String str;
	 * 
	 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 * System.out.println("Enter a string:"); str = br.readLine(); char[] c =
	 * str.toCharArray(); for (int i = 0; i < c.length; i++) { if (c[i] >= 'a' &&
	 * c[i] <= 'z') { c[i] = (char) (c[i] - 32); } }
	 * 
	 * System.out.println("Uppercase conversion:"); System.out.println(c); }
	 */

	/*
	 * public static void main(String[] args) {/*
	 * 
	 * int array[][] = new int[3][3]; int array1[][] = new int[3][3]; int array2[][]
	 * = new int[3][3]; int c = 0, d = 0, a = 5, b = 4; Scanner scan = new
	 * Scanner(System.in);
	 * 
	 * for (int i = 0; i < 3; i++) { for (int j = 0; j < 3; j++) {
	 * System.out.println("Matrix 1st [" + i + "][" + j + "]:"); array[i][j] =
	 * scan.nextInt(); } }
	 * 
	 * for (int i = 0; i < 3; i++) { for (int j = 0; j < 3; j++) {
	 * System.out.println("Matrix 2nd [" + i + "][" + j + "]:"); array1[i][j] =
	 * scan.nextInt(); } }
	 * 
	 * // write your logic here for (int i = 0; i < 3; i++) { for (int j = 0; j < 3;
	 * j++) { array2[i][j] = 0; for (int k = 0; k < 3; k++) { array2[i][j] =
	 * array2[i][j] + (array[i][k] * array1[k][j]); }
	 * 
	 * } }
	 * 
	 * // end
	 * 
	 * System.out.println("Multiply of both matrix:");
	 * 
	 * for (int i = 0; i < 3; i++) { for (int j = 0; j < 3; j++) {
	 * System.out.print(array2[i][j] + " "); } System.out.println(); } }
	 */

	/*
	 * public static String names[] = { "harry", "michael", "will", "tom", "jackie"
	 * }; public static String surnames[] = { "potter", "jackson", "smith",
	 * "cruise", "chan" };
	 * 
	 * public static void main(String a[]) throws Exception { Scanner sc = new
	 * Scanner(System.in); String name; System.out.println("Enter the name:"); name
	 * = sc.next(); System.out.println("Full name of the celebraty is:"); int n = 0;
	 * for (int i = 0; i < names.length; i++) { if (name.equalsIgnoreCase(names[i]))
	 * { n = i; break; } } System.out.println(name + " " + surnames[n]); }
	 */// main
		// 1475
	public static void main(String arg[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the date(ddmmyy):");
		int number = Integer.parseInt(br.readLine());
		number = findLucky(number);
		System.out.println("Your lucky number is:");
		System.out.println(number);
	}// main

	static int findLucky(int num) {
		int t = num, sum = 0;
		while (t != 0) {
			int r = t % 10;
			sum = sum + r;
			t = t / 10;
		}
		if (sum > 9) {
			sum = findLucky(sum);
		}
		return sum;
	}
}// main
