package com.programin.$08_02.assig;

import java.util.Scanner;

public class FindPerfectNumberInArrary {

	private static Scanner sc;

	public static void main(String[] args) {
		int a[] = readArrary();
		int rs = countPerfectNumber(a);
		System.out.println("Total perfect number inside this Array is=" + rs);
	}

	private static int countPerfectNumber(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (isPerfect(a[i])) {
				count++;
			}
		}
		return count;
	}

	private static boolean isPerfect(int i) {
		int sum = 0;
		for (int j = 1; j <= i / 2; j++) {
			if (i % j == 0) {
				sum = sum + j;
			}
		}
		return i == sum;
	}

	private static int[] readArrary() {
		sc = new Scanner(System.in);
		System.out.println("Enter size of arrary");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter your " + n + " values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}
}