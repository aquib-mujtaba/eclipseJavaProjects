package com.programin.matrix.$28_02.Q66;

public class Runner {

	public static void main(String[] args) {
		Matrix tm = new Matrix();
		int[][] rs = tm.read();
		System.out.println("Matrix before transpose");
		tm.disMatrix(rs);
		System.out.println("Matrix after transpose");
		int r[][] = tm.rowReverse(rs);
		tm.disMatrix(r);
		System.out.println("Matrix Coloumn Swap");
		int c[][] = tm.coloumnRevers(rs);
		tm.disMatrix(c);
	}

}
