package com.programin.$08_02.arraryReverse;

import java.util.Scanner;

public class AraryOpration {
	int[] readArrary() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter your " + n + " Values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	void disArray(int[] n) {
		System.out.print("{");
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + ",");
		}
		System.out.print("}");
		System.out.println();
	}

	int[] mergeArray(int[] a, int[] b) {
		int z[] = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			z[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			z[a.length + i] = b[i];
		}
		return z;
	}

	public void reverseArrary(int[] x) {
		for (int i = 0; i < x.length / 2; i++) {
			int t = x[i];
			x[i] = x[x.length - 1 - i];
			x[x.length - 1 - i] = t;
		}
	}
}