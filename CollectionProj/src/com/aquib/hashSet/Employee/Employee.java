package com.aquib.hashSet.Employee;

public class Employee {

	double sal;
	String ename;
	int eid;

	public Employee(double sal, String ename, int eid) {
		super();
		this.sal = sal;
		this.ename = ename;
		this.eid = eid;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [sal=" + sal + ", ename=" + ename + ", eid=" + eid + "]";
	}

	@Override
	public int hashCode() {
		return ename.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return this.hashCode() == obj.hashCode();
	}

}
