package com.programin.$18_01.reportCard;

import java.util.Scanner;

public class ReportCard {
	public static void main(String[] args) {
		System.out.println("Enter name ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Enter Roll number");
		int roll = sc.nextInt();
		System.out.println("Enetr marks of four Subject ");
		int ph = sc.nextInt();
		int ch = sc.nextInt();
		int mt = sc.nextInt();
		int bio = sc.nextInt();
		sc.close();
		System.out.println("-----------Report Card-------");
		System.out.println("-----------------------------");
		System.out.println("Name  : " + name);
		System.out.println("Roll  : " + roll);
		System.out.println("------------------------------");
		System.out.println(" Subject      Max Min Obtain");
		System.out.println("------------------------------");
		System.out.println("Physics       100  40  " + ph);
		System.out.println("Chemistry     100  40  " + ch);
		System.out.println("Math          100  40  " + mt);
		System.out.println("Biology       100  40  " + bio);
		System.out.println("-------------------------------");
		System.out.println("Total         400  160 " + getTotal(ch, mt, ph, bio));
		System.out.println("-------------------------------");

		System.out.println("Percent:" + getTotal(ch, mt, ph, bio) / 4.0);

		System.out.println("Result :" + getResult(ch, mt, ph, bio));
		System.out.println("-------------------------------");
	}

	private static String getResult(int ch, int mt, int ph, int bio) {
		String result;
		if (ph < 40 || mt < 40 || ch < 40 || bio < 40) {
			result = "Fail";
		} else {
			double pr = getTotal(ch, mt, ph, bio) / 4.0;
			if (pr >= 90)
				result = "Distinction";
			else if (pr >= 80) {
				result = "A";
			} else if (pr >= 60) {
				result = "B";
			} else if (pr >= 50) {
				result = "C";
			} else {
				result = "D";
			}
		}
		return result;
	}

	private static int getTotal(int ch, int mt, int ph, int bio) {
		return (ch + mt + bio + ph);
	}
}
