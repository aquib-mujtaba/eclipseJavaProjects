package com.programin.$07_02.assg;

import java.util.Scanner;

public class CountOfdivisibles {

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
			if (arr[i] % 5 == 0) {
				count++;
			}
		}
		System.out.println("Total numbers which Divisible by 5= " + count);
	}

}
