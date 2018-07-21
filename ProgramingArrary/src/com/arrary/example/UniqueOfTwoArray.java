package com.arrary.example;

public class UniqueOfTwoArray {
	public static void main(String[] args) {
		int a[] = { 15, 23, 28, 25, 54, 13 };
		int b[] = { 15, 26, 25, 56, 13, 18 };
		int r[] = getUnique(a, b);
		display(r);
	}

	private static void display(int[] r) {
		for (int i = 0; i < r.length; i++) {
			System.out.print(r[i] + ",");
		}
	}

	private static int[] getUnique(int[] a, int[] b) {
		int n = a.length + b.length;
		int t[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					i++;
					j--;
					n = n - 2;
				}
			}
			int k = 0;
			t[k] = a[i - 1];
			k++;
		}

		int na[] = new int[n];
		for (int i = 0; i < n; i++) {
			na[i] = t[i];
		}
		return na;
	}

	private static int[] concat(int[] a, int[] b) {
		int na[] = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			na[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			na[a.length + i] = b[i];
		}
		return na;
	}

}
