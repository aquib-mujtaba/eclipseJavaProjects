package com.programin.arrary.$14_02.Q38;

public class CountNvPsElemet {

	public static void main(String[] args) {
		int[] a = { -10, 20, 30, 6, -17, -15, 5, -20, 40 };
		int count[] = getCount(a);
		System.out.println("Total +ve number inside Array=" + count[0] + " & -ve value=" + count[1]);
	}

	private static int[] getCount(int[] a) {
		int r[] = new int[2];
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 0) {
				r[0]++;
			} else {
				r[1]++;
			}
		}
		return r;
	}

}
