package com.programin.arrary.$26_02;

public class SortArray {
	public static void main(String[] args) {
		int arr[] = { 6, 1, 2, 1, 4, 2, 7, 8, 3, 9, 7, 5 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int t;
				if (arr[i] < arr[j]) {
					t = arr[j];
					arr[j] = arr[i];
					arr[i] = t;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
