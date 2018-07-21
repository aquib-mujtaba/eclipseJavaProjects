package com.programin.$07_02;

public class Arrary {

	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0] = 45;
		arr[1] = 28;
		arr[2] = 49;
		arr[3] = 69;
		arr[4] = 18;
		int sum = 0;
		// for (int i = 0; i < arr.length; i++) {
		// sum = sum + arr[i];
		// }
		// System.out.println("sum of five variable " + sum);
		// System.out.println("Aver of five variable " + sum / (double) (arr.length));
		for (int i : arr) {
			// System.out.println(i);
			sum = sum + i;
		}
		System.out.println("sum of five variable " + sum);
		System.out.println("Aver of five variable " + sum / (double) (arr.length));

	}

}
