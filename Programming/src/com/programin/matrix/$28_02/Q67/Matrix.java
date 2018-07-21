package com.programin.matrix.$28_02.Q67;

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

	void leftRotation(int matx[][]) {
		for (int i = matx.length - 1; i >= 0; i--) {
			for (int j = 0; j < matx.length; j++) {
				int t = matx[i][j];
				matx[i][j] = matx[j][matx.length - 1 - i];
				matx[j][matx.length - 1 - i] = t;
			}
		}
	}
}
