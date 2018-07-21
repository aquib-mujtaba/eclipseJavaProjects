package com.aquib.treeset.comparaterTypCons;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class EmpRunner {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet(new BasedOnId());
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter Emp ID");
			int eid = sc.nextInt();
			System.out.println("Enter Emp Name");
			String ename = sc.next();
			System.out.println("Enter Emp Sal");
			double sal = sc.nextDouble();
			Employee emps = new Employee(sal, ename, eid);
			ts.add(emps);
			System.out.println("Do you have More Emp");
			String choice = sc.next();
			if (choice.equalsIgnoreCase("No")) {
				break;
			}
		}
		Iterator it = ts.iterator();
		System.out.println("==========BAsed On Id===========");
		for (Object object : ts) {
			System.out.println(it.next());
		}
		System.out.println("==========Based On Sal=========");
		TreeSet tss = new TreeSet(new BasedOnSal());
		tss.addAll(ts);
		Iterator itr = tss.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("========Based On name===========");
		TreeSet tsn = new TreeSet(new BasedOnName());
		tsn.addAll(ts);
		Iterator itra = tsn.iterator();
		while (itra.hasNext()) {
			System.out.println(itra.next());
		}
		System.out.println("--------------Hetrogeneous Object Based on Name -------------");
		TreeSet hts = new TreeSet(new compStdEmp());
		hts.addAll(tsn);
		Iterator hit = hts.iterator();
		while (hit.hasNext()) {
			System.out.println(hit.next());
		}
	}

}
