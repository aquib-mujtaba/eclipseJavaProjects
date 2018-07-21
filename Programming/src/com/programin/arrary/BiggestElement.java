package com.programin.arrary;

public class BiggestElement {

	public static void main(String[] args) {
		int arr[] = { 23, 45, 56, 23, 56, 78, 56, 12 };
		int big = getBiggest(arr);
		System.out.println("Biggest element =" + big);
	}

	private static int getBiggest(int[] a) {
		int b = a[0];
		for (int i = 0; i < a.length; i++) {
			if (b < a[i]) {
				b = a[i];
			}
		}
		return b;
	}

}
