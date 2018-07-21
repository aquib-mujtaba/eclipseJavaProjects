package com.aquib.constructer_overloading;

public class Test {
	public static void main(String[] args) {
		Applicant a = new Applicant();
		Applicant a1 = new Applicant(false);
		Applicant a2 = new Applicant(5000);
		Applicant a3 = new Applicant("Aquib");
		Applicant a4 = new Applicant("Aquib", 60000, false);
		System.out.println("Name " + a.name + " Salary " + a.sal + " Married " + a.isMarried);
		System.out.println("Name " + a1.name + " Salary " + a1.sal + " Married " + a1.isMarried);
		System.out.println("Name " + a2.name + " Salary " + a2.sal + " Married " + a2.isMarried);
		System.out.println("Name " + a3.name + " Salary " + a3.sal + " Married " + a3.isMarried);
		System.out.println("Name " + a4.name + " Salary " + a4.sal + " Married " + a4.isMarried);
	}
}
