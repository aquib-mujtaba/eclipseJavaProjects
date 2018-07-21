package com.programin.$06_02.assg;

public class Assigment7 {
	public static void main(String[] args) {
		int n = 5;
		int k = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {

				if (i <= 2)
					System.out.print(j);
				else if (i > 2) {
					if (k > 9) {
						k = 1;
					}
					System.out.print(k);
					k++;
				}
			}
			System.out.println();
		}
	}

}
