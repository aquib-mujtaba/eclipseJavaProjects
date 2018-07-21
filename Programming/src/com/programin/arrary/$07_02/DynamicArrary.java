package com.programin.$07_02;

public class DynamicArrary {

	public static void main(String[] args) {
		int arr[] = { 28, 10, 12, 15, 11 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "------------>" + arr[i]);
		}
		System.out.println("----------------");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(i + "------------>" + arr[i]);
		}
		/*
		 * Arary can be initilize at the time of decleration it self
		 **/
		int[] x = { 12, 5, 8, 4 }, y, z;
		y = new int[] { 1, 2 };
		z = new int[] { 1, 10, 15 };
		// z= {1,2,5,5}; // error
	}
}
