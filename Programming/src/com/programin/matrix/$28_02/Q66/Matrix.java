package com.programin.matrix.$28_02.Q66;

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

	int[][] rowReverse(int mat[][]) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length / 2; j++) {
				int t = mat[i][j];
				mat[i][j] = mat[i][mat[i].length - 1 - j];
				mat[i][mat[i].length - 1 - j] = t;
			}
		}
		return mat;
	}

	int[][] coloumnRevers(int mat[][]) {
		for (int i = 0; i < mat.length / 2; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				int t = mat[i][j];
				mat[i][j] = mat[mat.length - 1 - i][j];
				mat[mat.length - 1 - i][j] = t;
			}
		}
		return mat;

	}
}
