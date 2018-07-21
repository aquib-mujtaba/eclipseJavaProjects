package com.programin.$07_02.assg;

import java.util.Scanner;

public class CountEvenOddInArray {

	public static void main(String[] args) {
		int odd = 0, even = 0;
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
			if (arr[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Number of Odd Digits =" + odd + "\n Even Numbers count =" + even);
	}

}
