package com.programin.$02_03.Q72;

public class DayConter {

	public static void main(String[] args) {
		Date d1 = new Date(13, 5, 1995);
		Date d2 = new Date(2, 3, 2018);
		int days = numberOfDays(d1, d2);
		System.out.println("Number of days Between " + d1 + " & " + d2 + " is= " + days);

	}

	private static int numberOfDays(Date d1, Date d2) {
		int x = d1.totalDays();
		int y = d2.totalDays();
		System.out.println("Numbe x=" + x);
		System.out.println("Numbe y=" + y);
		if (x > y) {
			return x - y;
		} else {
			return y - x;
		}
	}

}
