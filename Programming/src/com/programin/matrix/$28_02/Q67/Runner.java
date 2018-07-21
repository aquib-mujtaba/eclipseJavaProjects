package com.programin.matrix.$28_02.Q67;

public class Runner {

	public static void main(String[] args) {
		Matrix m = new Matrix();
		int[][] rs = m.read();
		System.out.println("Before Reversing the elements");
		m.disMatrix(rs);
		m.leftRotation(rs);
		m.disMatrix(rs);
	}
}
