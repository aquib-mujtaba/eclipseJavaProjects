package com.programin.arrary.$15_02.Q40;

public class NthBiggestNumber {

	public static void main(String[] args) {
		int ar[] = { 56, 78, 18, 89, 32, 53 };// 89,78,56,53,32,18
		int rs = ntBiggestNumber(ar, 4);
		System.out.println("nth biggest number  is=" + rs);
	}

	private static int ntBiggestNumber(int[] ar, int n) {
		for (int j = 0; j < ar.length; j++) {
			int count = 0;
			for (int i = 0; i < ar.length; i++) {
				if (ar[j] < ar[i])
					count++;
			}
			if (count == n - 1) {
				return ar[j];
			}
		}
		return 0;
	}

}
