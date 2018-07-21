package com.arrary.example;

public class CountOddEven {

	public static void main(String[] args) {
		int arr[] = { 23, 45, 56, 23, 56, 78, 56, 12 };
		int count[] = getOddEven(arr);
		System.out.println("Even numbers inside array =" + count[0]);
		System.out.println("Odd numbers inside array=" + count[1]);
	}

	private static int[] getOddEven(int[] arr) {
		int c[] = new int[2];
		for (int i = 0; i < arr.length; i++) {
			c[arr[i] % 2]++;
		}
		return c;
	}

}
