package com.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DateSorting {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the first date(mm/dd/yyyy):");
		String d1 = br.readLine();
		System.out.println("Enter the second date(mm/dd/yyyy):"); //
		String d2 = br.readLine();
		String d3 = sorting(d1, d2);
		System.out.println("Sorted dates are(mm/dd/yyyy):");
		System.out.println(d3);
		if (d3.equalsIgnoreCase(d1)) {
			System.out.println(d2);
		} else {
			System.out.println(d1);
		}

	}

	private static String sorting(String d1, String d2) {
		String year1 = subYear(d1);
		String year2 = subYear(d2);
		String month1 = subMonth(d1);
		String month2 = subMonth(d2);
		String dd1 = subDay(d1);
		String dd2 = subDay(d2);
		if (!year1.equals(year2)) {
			if (year1.compareTo(year2) > 0) {
				return d2;
			} else {
				return d1;
			}
		} else if (!month1.equals(month2)) {
			if (month1.compareTo(month2) > 0) {
				return d2;
			} else {
				return d1;
			}
		} else {
			if (dd1.compareTo(dd2) > 0) {
				return d2;
			} else {
				return d1;
			}
		}
	}

	private static String subMonth(String d) {
		char[] d1 = d.toCharArray();
		String t = "";
		int k = 0;
		while (d1[k] != '/') {
			k++;
		}
		int i = k;
		while (d1[i] != '/') {
			t = t + d1[i];
			i++;
		}
		return t;
	}

	private static String subYear(String d) {
		char[] d1 = d.toCharArray();
		String t = "";
		int i = d.length() - 1;
		while (d1[i] != '/') {
			t = d1[i] + t;
			i--;
		}
		return t;
	}

	private static String subDay(String d) {
		char[] d1 = d.toCharArray();
		String t = "";
		int i = 0;
		while (d1[i] != '/') {
			t = t + d1[i];
			i++;
		}
		return t;
	}

}
