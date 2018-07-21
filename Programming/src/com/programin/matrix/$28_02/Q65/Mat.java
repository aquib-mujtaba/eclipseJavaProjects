package com.programin.matrix.$28_02.Q65;

import java.util.Scanner;

public class Mat {
	public static void main(String[] args) {
		int r[][] = readMatrix();
		System.out.println("Before Transpose");
		display(r);
		// /transpose(r);
		System.out.println("After Transpose");
		// display(r);
		// rowReverse(r);
		columnReverse(r);
		display(r);
	}

	private static void columnReverse(int[][] r) {
		for (int i = 0; i < r.length / 2; i++) {
			for (int j = 0; j < r[i].length; j++) {
				int t = r[i][j];
				r[i][j] = r[r.length - 1 - i][j];
				r[r.length - 1 - i][j] = t;
			}

		}
	}

	private static void rowReverse(int[][] r) {
		for (int i = 0; i < r.length; i++) {
			for (int j = 0; j < r[i].length / 2; j++) {
				int t = r[i][j];
				r[i][j] = r[i][r.length - 1 - i];
				r[i][r.length - i - 1] = t;
			}
		}

	}

	private static void transpose(int[][] r) {
		for (int i = 0; i < r.length; i++) {
			for (int j = i + 1; j < r.length; j++) {
				int t = r[i][j];
				r[i][j] = r[j][i];
				r[j][i] = t;
			}
		}
	}

	private static void display(int[][] r) {
		for (int i = 0; i < r.length; i++) {
			for (int j = 0; j < r[i].length; j++) {
				System.out.print(r[i][j] + " ");
			}
			System.out.println();
		}
	}

	static int[][] readMatrix() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row And Column Value");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int matrix[][] = new int[r][c];
		for (int i = 0; i < matrix.length; i++) {
			System.out.println("Enter " + (i + 1) + "row values");
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		return matrix;
	}
}
