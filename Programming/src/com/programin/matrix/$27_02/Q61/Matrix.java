package com.programin.matrix.$27_02.Q61;

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

	int[][] addMatrix(int x[][], int[][] y) {
		if (x.length != y.length || x[0].length != y[0].length) {
			System.out.println("order must be same");
			return null;
		}
		int sum[][] = new int[x.length][x[0].length];
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				sum[i][j] = x[i][j] + y[i][j];
			}
		}
		return sum;
	}

	int[][] substractMatrix(int x[][], int y[][]) {
		if (x.length != y.length || x[0].length != y[0].length) {
			System.out.println("order must be same");
			return null;
		}
		int sum[][] = new int[x.length][x[0].length];
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				sum[i][j] = x[i][j] - y[i][j];
			}
		}
		return sum;
	}

	int biggestElement(int[][] x) {
		int b = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > b) {
					b = x[i][j];
				}
			}
		}
		return b;
	}

	void bigInRow(int[][] x) {
		for (int i = 0; i < x.length; i++) {
			int b = 0;
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > b) {
					b = x[i][j];
				}
			}
			System.out.println("Biggest element in " + (i + 1) + " row " + b);
		}

	}

	int[][] rotation(int x[][]) {
		transpose(x);
		int n = x.length - 1;
		for (int i = 0; i < x.length / 2; i++) {
			for (int j = 0; j < x.length; j++) {
				int t = x[i][j];
				x[i][j] = x[n - i][j];
				x[n - i][j] = t;
			}
		}
		return x;
	}

	int[][] transpose(int[][] x) {
		for (int i = 0; i < x.length; i++) {
			for (int j = i; j < x.length; j++) {
				int t = x[i][j];
				x[i][j] = x[j][i];
				x[j][i] = t;
			}
		}
		return x;
	}

}
