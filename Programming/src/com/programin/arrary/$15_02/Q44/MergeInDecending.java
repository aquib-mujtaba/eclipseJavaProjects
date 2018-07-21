package com.programin.arrary.$15_02.Q44;

public class MergeInDecending {

	public static void main(String[] args) {
		int a[] = { 56, 46, 33, 25, 12 };
		int b[] = { 78, 74, 70, 62 };
		int c[] = getSortedArr(a, b);
		disArray(c);
	}

	private static int[] getSortedArr(int[] a, int[] b) {
		int na[] = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] > b[j]) {
				na[k] = a[i];
				i++;
			} else {
				na[k] = b[j];
				j++;
			}
			k++;
		}
		while (i < a.length) {
			na[k] = a[i];
			k++;
			i++;
		}
		while (j < b.length) {
			na[k] = b[i];
			k++;
			j++;
		}

		return na;
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
