package com.aquib.treeset.comparaterTypCons;

import java.util.Comparator;

public class BasedOnId implements Comparator {

	/*
	 * @Override // Ascending Order public int compare(Object o1, Object o2) {
	 * Employee e1 = (Employee) o1; Employee e2 = (Employee) o2; return e1.eid -
	 * e2.eid; }
	 */
	@Override
	// Descending Order
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		return -(e1.eid - e2.eid);
	}
}
