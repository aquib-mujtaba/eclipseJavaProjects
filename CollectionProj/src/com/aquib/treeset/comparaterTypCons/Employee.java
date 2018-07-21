package com.aquib.treeset.comparaterTypCons;

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

}
