package com.aquib.hashSet.student;

public class Student {
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", per=" + per + "]";
	}

	int sid;
	String sname;
	double per;

	public Student(int sid, String sname, double per) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.per = per;
	}

	// @Override
	// Sort based on id
	// public int hashCode() {
	// return sid;
	// }

	@Override
	public int hashCode() {
		// return sname.hashCode(); //Sorting Alphabetical
		Double d = per;
		return d.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return this.hashCode() == obj.hashCode();
	}
}
