package com.programin.$06_02.assg;

public class Assigment1 {

	public static void main(String[] args) {
		int n = 7, st = 1, sp = n / 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= st; j++) {
				System.out.print(i % 2 + " ");
			}
			if (i <= n / 2) {
				st = st + 2;
				sp--;
			} else {
				st = st - 2;
				sp++;
			}
			System.out.println();
		}
	}

}