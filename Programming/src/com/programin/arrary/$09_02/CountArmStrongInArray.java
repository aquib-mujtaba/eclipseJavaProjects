package com.programin.$09_02;

import java.util.Scanner;

public class CountArmStrongInArray {

	private static Scanner sc;

	public static void main(String[] args) {
		int count = 0;
		int a[] = readArrary();
		for (int i = 0; i < a.length; i++) {
			if (isArmStrong(a[i])) {
				count++;
			}
		}

		System.out.println("Total Arm strong Number Inside this Arrary is=" + count);

	}

	private static boolean isArmStrong(int i) {
		int sum = 0, temp = i;
		int c = count(i);
		while (temp != 0) {
			int r = temp % 10;
			sum = sum + pow(r, c);
			temp = temp / 10;
		}
		return i == sum;
	}

	private static int pow(int r, int c) {
		int pw = 1;
		while (c > 0) {
			pw = pw * r;
			c--;
		}
		return pw;
	}

	private static int count(int i) {
		int count = 0;
		while (i != 0) {
			i = i / 10;
			count++;
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
