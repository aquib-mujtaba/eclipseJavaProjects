package com.programin.$09_02;

import java.util.Scanner;

public class CountHowManyTimesPresent {

	public static void main(String[] args) {

		int ar[] = readArrary();
		System.out.println("Enter your number To find");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int index = frequency(ar, n);
		if (index == 0) {
			System.out.println("Element is not present inside the Array");
		} else {
			System.out.println("Element is present " + index + " times");
		}
	}

	private static int frequency(int[] ar, int i) {
		int count = 0;
		for (int j = 0; j < ar.length; j++) {
			if (ar[j] == i) {
				count++;
			}

		}
		return count;
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
