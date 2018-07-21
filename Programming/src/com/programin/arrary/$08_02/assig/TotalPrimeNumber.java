package com.programin.$08_02.assig;

import java.util.Scanner;

public class TotalPrimeNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		int a[] = readArrary();
		int rs = totalPrimeNumber(a);
		System.out.println("Total Prime Number Inside this Arrary is=" + rs);

	}

	private static int totalPrimeNumber(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (isPrime(a[i])) {
				count++;
			}
		}
		return count;
	}

	private static boolean isPrime(int x) {
		int i = 2;
		while (i <= x / 2) {
			if (x % i == 0) {
				return false;
			}
			i++;
		}
		return true;
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
