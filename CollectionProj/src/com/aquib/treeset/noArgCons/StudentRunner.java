package com.aquib.treeset.noArgCons;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentRunner {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter Student ID");
			int id = sc.nextInt();
			System.out.println("Enter Student Name");
			String name = sc.next();
			System.out.println("Enter Student Prcent");
			double per = sc.nextDouble();
			Student sts = new Student(name, id, per);
			ts.add(sts);
			System.out.println("Do you have More Strudent");
			String choice = sc.next();
			if (choice.equalsIgnoreCase("No")) {
				break;
			}

		}
		Iterator it = ts.iterator();
		for (Object object : ts) {
			System.out.println(it.next());
		}

	}

}
