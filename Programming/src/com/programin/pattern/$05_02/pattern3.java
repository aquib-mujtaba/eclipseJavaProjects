package com.programin.pattern.$05_02;

public class pattern3 {
	public static void main(String[] args) {
		String st = "ChitraDurga";
		int k = 0;
		for (int i = 1;; i++) {
			for (int j = 1; j <= i; j++) {
				if (k == st.length())
					return;
				System.out.print(st.charAt(k) + " ");
				k++;
			}
			System.out.println();
		}
	}

}
