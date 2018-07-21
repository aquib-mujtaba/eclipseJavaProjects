package com.aquib.hashSet.Employee;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class EmpRunner {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter emp Id");
			int id = sc.nextInt();
			System.out.println("Enter emp Name");
			String name = sc.next();
			System.out.println("Enter emp sal");
			double sal = sc.nextDouble();
			boolean rhs = hs.add(new Employee(sal, name, id));
			if (rhs) {
				System.out.println("added Sucssesfully");
			} else {
				System.out.println("Fail to add");
			}
			System.out.println("Have you More Emp");
			String rs = sc.next();
			if (rs.equalsIgnoreCase("no")) {
				break;
			}
		}
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
		}
	}

}
