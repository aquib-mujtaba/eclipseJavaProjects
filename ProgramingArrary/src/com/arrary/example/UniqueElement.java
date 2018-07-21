package com.arrary.example;

public class UniqueElement {

	public static void main(String[] args) {
		int arr[] = { 23, 45, 56, 23, 12, 56, 78, 56, 12 };
		System.out.println("Array before delete");
		disArray(arr);
		arr = getUniqueArrary(arr);
		System.out.println("Array after deleting Dublicate value");
		disArray(arr);
	}

	private static int[] getUniqueArrary(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = arr[n - 1];
					n--;
					j--;
				}
			}
		}
		int na[] = new int[n];
		for (int i = 0; i < n; i++) {
			na[i] = arr[i];
		}
		return na;
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
