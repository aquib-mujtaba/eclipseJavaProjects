package com.programin.$07_02.assg;

import java.util.Scanner;

public class TotalNegativeValues {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter your " + n + " Values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				count++;
			}
		}
		System.out.println("Total negative values inside This arrary =" + count);
	}

}
