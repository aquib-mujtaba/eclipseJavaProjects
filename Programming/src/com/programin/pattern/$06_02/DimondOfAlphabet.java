package com.programin.$06_02;

public class DimondOfAlphabet {

	public static void main(String[] args) {

		int n = 7, st = 1, sp = n / 2, k = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= st; j++) {
				System.out.print((char) (j + 64));
			}
			if (i <= n / 2) {
				st = st + 2;
				sp--;
			} else {
				sp++;
				st = st - 2;
			}
			System.out.println();
		}

	}

}
