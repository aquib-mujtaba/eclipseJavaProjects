package com.programin.matrix.$28_02.Q65;

public class Runner {

	public static void main(String[] args) {
		TransposeMatrix tm = new TransposeMatrix();
		int[][] rs = tm.read();
		System.out.println("Matrix before transpose");
		tm.disMatrix(rs);
		System.out.println("Matrix after transpose");
		tm.traspose(rs);
		tm.disMatrix(rs);
	}
}
