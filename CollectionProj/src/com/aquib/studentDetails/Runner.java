
package com.aquib.studentDetails;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Info:--");
		ArrayList al = new ArrayList();
		while (true) {
			Student stdts = getStudent();
			al.add(stdts);
			System.out.println("Have you More Students? || Press No if Not ");
			String ch = sc.next();
			if (ch.equalsIgnoreCase("no")) {
				break;
			}
		}
		System.out.println("===+++++++++===Student Sheet===+++++++++====");
		for (Object obj : al) {
			System.out.println(obj);
		}
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Highest Student Percent Details are");
		Student hs = getHighest(al);
		System.out.println(hs);
	}

	private static Student getHighest(ArrayList al) {
		Student hstd = (Student) al.get(0);
		Iterator it = al.iterator();
		while (it.hasNext()) {
			Object ob = it.next();
			Student st = (Student) ob;
			if (hstd.getPer() < st.getPer()) {
				hstd = st;
			}
		}
		return hstd;
	}

	private static Student getStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student name:-");
		String name = sc.nextLine();
		System.out.println("Enter Student id");
		int id = sc.nextInt();
		System.out.println("Enter Number Of Subjects");
		int n = sc.nextInt();
		int m[] = new int[n];
		System.out.println("Enter " + n + " Subject Marks: ");
		for (int i = 0; i < m.length; i++) {
			m[i] = sc.nextInt();
		}
		return new Student(name, id, m);
	}

}
