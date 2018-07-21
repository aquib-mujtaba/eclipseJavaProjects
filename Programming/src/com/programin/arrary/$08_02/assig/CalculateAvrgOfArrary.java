package com.programin.$08_02.assig;

import java.util.Scanner;

public class CalculateAvrgOfArrary {
	private static Scanner sc;

	public static void main(String[] args) {
		int a[] = readArrary();
		double avrg = avrgOfArrary(a);
		System.out.println("Average of Arrary is=" + avrg);
	}

	private static double avrgOfArrary(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum / (double) a.length;
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
