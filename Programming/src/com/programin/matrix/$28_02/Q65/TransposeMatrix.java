package com.programin.matrix.$28_02.Q65;

import java.util.Scanner;

public class TransposeMatrix {
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

	void traspose(int mat[][]) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = i + 1; j < mat.length; j++) {
				int t = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = t;
			}
		}
	}
}
