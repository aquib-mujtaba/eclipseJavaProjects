package com.programin.$09_02;

import java.util.Scanner;

public class DeleteFromGiven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = readArrary();
		System.out.println("Enter The index Which you want to delete");
		int d = sc.nextInt();
		a = deleteElement(a, d);
		if (a == null) {
			System.out.println("Deletion fail");
		} else {
			System.out.println("After deletion");
			disArray(a);
		}
	}

	private static int[] deleteElement(int a[], int in) {
		if (in < 0 || in >= a.length) {
			System.out.println("your index is not in range");
			return null;
		}
		int newArray[] = new int[a.length - 1];
		for (int i = 0; i < newArray.length; i++) {
			if (i < in) {
				newArray[i] = a[i];
			} else {
				newArray[i] = a[i + 1];
			}
		}
		return newArray;
	}

	private static int[] readArrary() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of arrary");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter syour " + n + " values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	private static void disArray(int[] n) {
		System.out.print("{");
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + ",");

		}
		System.out.print("}");
		System.out.println();
	}

}
