package com.programin.arrary.$15_02.Q43;

public class NthSmallestNumber {

	public static void main(String[] args) {
		int ar[] = { 56, 78, 18, 89, 32, 53 };// 89,78,56,53,32,18
		int rs = ntSmallestNumber(ar, 1);
		System.out.println("nth smallest number  is=" + rs);

	}

	private static int ntSmallestNumber(int[] ar, int n) {
		for (int j = 0; j < ar.length; j++) {
			int cout = 0;
			for (int k = 0; k < ar.length; k++) {
				if (ar[j] > ar[k]) {
					cout++;
				}
			}
			if (cout == n - 1) {
				return ar[j];
			}
		}
		return 0;
	}

}
