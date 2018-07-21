package com.programin.$08_02.arraryReverse;

import java.util.Scanner;

public class Exmp {
	public static void main(String[] args) {
		// int arr[] = read();
		// System.out.println("Before Revrse");
		// displayArray(arr);
		// int[] r = reverse(arr);
		// System.out.println("After reversing");
		// displayArray(r);
		int a[] = { 1, 5, 6, 7 };
		int b[] = { 11, 65, 60, 17 };
		displayArray(merge(a, b));
	}

	static int[] read() {
		System.out.println("Enter Size of Your Aray");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter " + n + " elements");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	static void displayArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

	static int[] reverse(int arr[]) {
		for (int j = 0; j < arr.length / 2; j++) {
			int t = arr[j];
			arr[j] = arr[arr.length - 1 - j];
			arr[arr.length - 1 - j] = t;
		}
		return arr;
	}

	static int[] merge(int[] a, int[] b) {
		int n[] = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			n[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			n[a.length + i] = b[i];
		}
		return n;
	}
}
