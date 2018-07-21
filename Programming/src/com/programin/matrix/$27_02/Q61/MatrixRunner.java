package com.programin.matrix.$27_02.Q61;

import java.util.Scanner;

public class MatrixRunner {
	public static void main(String[] args) {
		Matrix m = new Matrix();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Matrix Elements");
		int[][] a = m.read();
		System.out.println("Enter Secound Matrix Elements");
		int[][] b = m.read();
		System.out.println("===============");
		System.out.println("First matrix Elements are");
		m.disMatrix(a);
		System.out.println("Secound matrix Elements are");
		m.disMatrix(b);
		System.out.println("------------Addition of Both Matrix is-----------");
		int[][] s = m.addMatrix(a, b);
		if (s != null) {
			m.disMatrix(s);
		}
		System.out.println("------------Substration of Both Matrix is-----------");
		int[][] sub = m.substractMatrix(a, b);
		if (sub != null) {
			m.disMatrix(sub);
		}
	}

}
