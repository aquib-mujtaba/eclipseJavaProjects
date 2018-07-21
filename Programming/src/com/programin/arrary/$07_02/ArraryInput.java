package com.programin.$07_02;

import java.util.Scanner;

public class ArraryInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter your " + n + " values ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i : arr) {
			sum = sum + i;
		}
		System.out.println("Sum of all the numbers =" + sum);
		System.out.println("Avrage of all the numbers =" + sum / (double) arr.length);
		sc.close();
	}

}
