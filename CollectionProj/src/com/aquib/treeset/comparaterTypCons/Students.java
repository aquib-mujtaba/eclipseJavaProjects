package com.aquib.treeset.comparaterTypCons;

public class Students {

	String name;
	int id;
	double per;

	public Students(String name, int id, double per) {
		this.name = name;
		this.id = id;
		this.per = per;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Students [name=" + name + ", id=" + id + ", per=" + per + "]";
	}

}
