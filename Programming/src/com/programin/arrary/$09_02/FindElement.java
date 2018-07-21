package com.programin.$09_02;

import java.util.Scanner;

public class FindElement {

	public static void main(String[] args) {
		int ar[] = readArrary();
		System.out.println("Enter your number To find");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int index = search(ar, n);
		if (index == -1) {
			System.out.println("Element is not present inside the Array");
		} else {
			System.out.println("Element is present at the " + index + " index");
		}
	}

	private static int search(int[] ar, int i) {
		for (int j = 0; j < ar.length; j++) {
			if (ar[j] == i) {
				return j;
			}

		}
		return -1;
	}

	private static int[] readArrary() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of arrary");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter syour " + n + " values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}
}
