package com.programin.$05_02;

public class Patterns1 {
	public static void main(String[] args) {
		String st = "Aquib";
		for (int i = 0; i < st.length(); i++) {
			for (int j = i; j >= 0; j--) {
				System.out.print(st.charAt(j) + " ");
			}
			System.out.println(" ");
		}
	}
}
