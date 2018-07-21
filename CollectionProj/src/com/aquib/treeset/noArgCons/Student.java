package com.aquib.treeset.noArgCons;

public class Student implements Comparable {
	String name;
	int sid;
	double pr;

	public Student(String name, int sid, double pr) {
		super();
		this.name = name;
		this.sid = sid;
		this.pr = pr;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [Name=" + name + ", Id=" + sid + ", Percent=" + pr + "]";
	}

	/*
	 * @Override
	 * 
	 * public int compareTo(Object o) { Student st = (Student) o; return this.sid -
	 * st.sid; }
	 */
	/*
	 * For Ascending public int compareTo(Object o) { Student st = (Student) o;
	 * if(this.pr < st.pr) return -1; else return 1; }
	 */
	/*
	 * for Descending Order
	 */
	/*
	 * @Override public int compareTo(Object o) { Student st = (Student) o; if
	 * (this.pr < st.pr) return 1; else return -1; }
	 */
	public int compareTo(Object o) {
		Student st = (Student) o;
		if (this.name.compareTo(st.name) > 0)
			return 1;
		else
			return -1;
	}
}
