package com.programin.$18_01.paycheck;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name ");
		String name = sc.nextLine();
		System.out.println("Enter eid");
		int eid = sc.nextInt();
		System.out.println("Enter Your Basic Sal");
		double sal = sc.nextDouble();
		System.out.println("Enter Special If any");
		double sp = sc.nextDouble();
		System.out.println("===========================");
		System.out.println("Name  : " + name);
		System.out.println("EmpId : " + eid);
		System.out.println("===========================");
		System.out.println(" Basic Salary Is  = " + sal);
		System.out.println(" HRA Of Emp       = " + getPercent(sal, 15));
		System.out.println(" Commition of Emp = " + getPercent(sal, 8));
		System.out.println(" Special          = " + sp);
		System.out.println("===========================");
		double total = total(sal, sp, getPercent(sal, 15), getPercent(sal, 8));
		System.out.println("Total = " + total);
		System.out.println("===========================");
		int i = 200;
		int l = 700;
		System.out.println("===========================");
		System.out.println(" PF Deduction  = " + getPercent(sal, 12));
		System.out.println(" PT Deduction  = " + getPercent(sal, 5));
		System.out.println(" TDS Deduction = " + getPercent(sal, 10));
		System.out.println(" Insurance  Deduction = " + i);
		System.out.println(" Insurance  Deduction = " + l);
		System.out.println("===========================");
		double deduct = totalDeduction(l, i, +getPercent(sal, 10), getPercent(sal, 12), getPercent(sal, 5));
		System.out.println("Total Deduction = " + deduct);
		System.out.println("===========================");
		System.out.println("Net Pay of Employee = " + (total - deduct));
	}

	private static double totalDeduction(int l, int i, double d, double percent, double percent2) {
		double deduc = (l + i + d + percent + percent2);
		return deduc;
	}

	private static double total(double sal, double sp, double percent, double percent2) {
		double total = (sal + sp + percent + percent2);
		return total;
	}

	private static double getPercent(double s, int i) {

		double pr = (i / s) * 100;
		return pr;
	}

}
