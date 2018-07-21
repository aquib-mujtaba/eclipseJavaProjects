package com.programin.matrix.Q71;

import java.util.Scanner;

public class Matrix {
	int[][] read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns");
		int r = sc.nextInt();
		int c = sc.nextInt();
		// int matx[][]=new int[r][c];
		// int [][]matx=new int[r][c];
		// Any of these deceleration is correct
		int[] matx[] = new int[r][c];
		for (int i = 0; i < matx.length; i++) {
			System.out.println("enter " + (i + 1) + " row elements: ");
			for (int j = 0; j < matx[i].length; j++) {
				matx[i][j] = sc.nextInt();
			}
		}
		return matx;
	}

	void disMatrix(int matx[][]) {
		System.out.println("Yor Matrix is ");
		for (int i = 0; i < matx.length; i++) {
			for (int j = 0; j < matx[i].length; j++) {
				System.out.print(matx[i][j] + " ");
			}
			System.out.println();
		}
	}

	void displaySpiral(int[][] mat) {
		int n = mat.length;
		for (int i = 0, j = n - 1; i < j; i++, j--) {
			for (int k = i; k < j; k++) {
				System.out.print(mat[i][k] + ",");
			}
			for (int k = i; k < j; k++) {
				System.out.print(mat[k][j] + ",");
			}
			for (int k = j; k > i; k--) {
				System.out.print(mat[j][k] + ",");
			}
			for (int k = j; k > i; k--) {
				System.out.print(mat[k][i] + ",");
			}
		}
		if (n % 2 == 1) {
			System.out.println(mat[n / 2][n / 2]);
		}
	}

	public static void main(String[] args) {
		Matrix m = new Matrix();
		int r[][] = m.read();
		m.disMatrix(r);
		System.out.println("Element in spiral order are ");
		m.displaySpiral(r);
	}
}
