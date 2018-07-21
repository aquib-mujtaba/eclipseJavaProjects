package com.programin.arrary.$15_02.Q42;

public class MergeSortedForm {

	public static void main(String[] args) {
		int x[] = { 21, 36, 78, 89, 92 };
		int y[] = { 12, 28, 32, 52 };
		int c[] = mergeArrary(x, y);
		disArray(c);
	}

	private static int[] mergeArrary(int[] x, int[] y) {
		int rs[] = new int[x.length + y.length];
		int k = 0, i = 0, j = 0;
		while (i < x.length && j < y.length) {
			if (x[i] < y[j]) {
				rs[k] = x[i]; // { 21, 36, 78, 89, 92 };
				i++; // { 12, 28, 32, 52 };
			} else {
				rs[k] = y[j];
				j++;
			}
			k++;
		}
		while (j < y.length) {
			rs[k] = y[j];
			k++;
			j++;
		}
		while (i < x.length) {
			rs[k] = x[i];
			k++;
			i++;
		}

		return rs;
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
