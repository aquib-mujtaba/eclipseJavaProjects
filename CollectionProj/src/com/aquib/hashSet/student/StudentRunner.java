package com.aquib.hashSet.student;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class StudentRunner {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter Name Of Student");
			String name = sc.next();
			System.out.println("Enter id Of Student");
			int id = sc.nextInt();
			System.out.println("Enter Percent Of Student");
			double pr = sc.nextDouble();
			Student std = new Student(id, name, pr);
			hs.add(std);
			System.out.println("Have you more Students");
			String cho = sc.next();
			if (cho.equalsIgnoreCase("no")) {
				break;
			}
		}
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
