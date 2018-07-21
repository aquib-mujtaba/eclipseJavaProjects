package com.programin.$18_01.checkGrade;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		int m1;
		int m2;
		int m3;
		int m4;
		int m5;
		System.out.println("Enter Marks");
		Scanner sc = new Scanner(System.in);
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		m4 = sc.nextInt();
		m5 = sc.nextInt();
		char rs = getGrade(m1, m2, m3, m4, m5);
		System.out.println("Grade is " + rs);

	}

	static char getGrade(int m1, int m2, int m3, int m4, int m5) {
		char grade;
		if (m1 < 40 || m2 < 40 || m3 < 40 || m4 < 40 || m5 < 40) {
			grade = 'F';
		} else {
			double pr = (m1 + m2 + m3 + m4 + m5) / 4.0;
			if (pr >= 80) {
				grade = 'A';
			} else if (pr >= 60) {
				grade = 'B';
			} else if (pr >= 50) {
				grade = 'C';
			} else {
				grade = 'D';
			}
		}

		return grade;
	}

}
