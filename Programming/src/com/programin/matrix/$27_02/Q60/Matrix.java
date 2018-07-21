package com.programin.matrix.$27_02.Q60;

public class Matrix {
	public static void main(String[] args) {
		int mat[][] = { { 0, 1, 2 }, { 45, 42, 41, 46 }, { 32, 92 } };
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
