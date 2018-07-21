package com.programin.arrary.$15_02.Q41;

public class MergeArrayZigZag {

	public static void main(String[] args) {
		int a[] = { 56, 78, 18, 89, 32, 53 };
		int b[] = { 28, 52, 17, 21 };
		int[] c = getZIgZag(a, b);
		disArray(c);

	}

	private static int[] getZIgZag(int[] a, int[] b) {
		int na[] = new int[a.length + b.length];
		int i = 0, j = 0;
		for (; i < a.length && i < b.length; i++, j++) {
			na[j] = a[i];
			j++;
			na[j] = b[i];
		}
		for (; i < b.length; i++, j++) {
			na[j] = b[i];
		}
		for (; i < a.length; i++, j++) {
			na[j] = a[i];
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
