package com.programin.$09_02;

import java.util.Scanner;

public class InsertAtIndex {
	public static void main(String[] args) {
		int a[] = readArrary();
		a = insertElement(a, 2, 35);
		if (a == null) {
			System.out.println("Insertion fail");
		} else {
			System.out.println("After insertion");
			disArray(a);
		}
	}

	private static int[] insertElement(int a[], int in, int ele) {
		if (in < 0 || in > a.length) {
			System.out.println("your index is not in range");
			return null;
		}
		int newArray[] = new int[a.length + 1];
		for (int i = 0; i < a.length; i++) {
			if (i < in) {
				newArray[i] = a[i];
			} else {
				newArray[i + 1] = a[i];
			}
			newArray[in] = ele;
		}
		return newArray;
	}

	private static int[] readArrary() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of arrary");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter your " + n + " values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	private static void disArray(int[] n) {
		System.out.print("{");
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + ",");
		}
		System.out.print("}");
		System.out.println();
	}
}
