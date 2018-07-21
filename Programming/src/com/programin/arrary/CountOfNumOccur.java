package com.programin.arrary;

public class CountOfNumOccur {
	public static void main(String[] args) {
		int arr[] = { 23, 45, 56, 23, 56, 78, 65, 12 };
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			System.out.println(arr[i] + "====>>" + count);
		}
	}
}
