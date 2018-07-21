package com.programin.pattern.$05_02;

public class Pattern2 {
	public static void main(String[] args) {
		String st = "Aquib ";
		for (int i = st.length(); i > 0; i--) {
			for (int j = 0; j < i; j++)
				System.out.print(st.charAt(j) + " ");
			System.out.println();
		}
	}
}
