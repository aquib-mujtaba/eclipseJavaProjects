package com.programin.arrary.$14_02.Q37;

public class NumberOfUniqeElements {

	public static void main(String[] args) {
		int arr[] = { 45, 23, 78, 56, 12 };
		int count = getCountUniqueEle(arr);
		System.out.println("Total Unique Element In Array Is=" + count);
	}

	private static int getCountUniqueEle(int[] arr) {
		int unq = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				unq++;
			}
		}
		return unq;
	}

}
