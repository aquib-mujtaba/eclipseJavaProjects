package com.programin.$08_02.assig;

import java.util.Scanner;

public class TotalOddEvenNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		int a[] = readArrary();
		int te = totalEvenNumber(a);
		int to = totalOddNumber(a);
		System.out.println("Total Odd Numbers Present Inside this Arrary is=" + to
				+ "\n Total Even Numbers persent inside this arrary=" + te);
		totalOddAndEvenNumber(a);
	}

	private static void totalOddAndEvenNumber(int[] a) {
		int odd = 0, even = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Total Odd Numbers Present Inside this Arrary is=" + odd
				+ "\n Total Even Numbers persent inside this arrary=" + even);
	}

	private static int totalOddNumber(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				sum++;
			}
		}
		return sum;
	}

	private static int totalEvenNumber(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				count++;
			}
		}
		return count;
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
