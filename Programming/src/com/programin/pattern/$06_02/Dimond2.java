package com.programin.$06_02;

public class Dimond2 {

	public static void main(String[] args) {

		int n = 7, st = 1, sp = n / 2;
		;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			int k = st / 2 + 1;
			for (int j = 1; j <= st; j++) {
				System.out.print(k);
				if (j <= st / 2) {
					k--;
				} else {
					k++;
				}
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
