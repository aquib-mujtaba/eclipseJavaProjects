package com.programin.matrix.$27_02.Q61;

public class BiggestNumber {
	public static void main(String[] args) {
		Matrix m = new Matrix();
		int b[][] = m.read();
		// int r = m.biggestElement(b);
		// m.bigInRow(b);
		System.out.println("--------------");
		// m.disMatrix(m.transpose(b));
		m.disMatrix(m.rotation(b));
		// System.out.println("biggest number =" + r);
	}
}
