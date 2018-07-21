package com.programin.matrix.$27_02.Q60;

import java.util.Scanner;

public class MatrixInput {
	public static void main(String[] args) {
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
		System.out.println("Yor Matrix is ");
		for (int i = 0; i < matx.length; i++) {
			for (int j = 0; j < matx[i].length; j++) {
				System.out.print(matx[i][j] + " ");
			}
			System.out.println();
		}
	}
}
