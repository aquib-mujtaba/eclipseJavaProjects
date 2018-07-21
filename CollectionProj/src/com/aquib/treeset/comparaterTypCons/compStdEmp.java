package com.aquib.treeset.comparaterTypCons;

import java.util.Comparator;

public class compStdEmp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Students && o2 instanceof Students) {
			Students s1 = (Students) o1;
			Students s2 = (Students) o2;
			if (s1.name.compareTo(s2.name) > 0) {
				return 1;
			} else {
				return -1;
			}
		}
		if (o1 instanceof Students && o2 instanceof Employee) {
			Students s1 = (Students) o1;
			Employee e2 = (Employee) o2;
			if (s1.name.compareTo(e2.ename) > 0) {
				return 1;
			} else {
				return -1;
			}
		}
		if (o1 instanceof Employee && o2 instanceof Employee) {
			Employee e1 = (Employee) o1;
			Employee e2 = (Employee) o2;
			if (e1.ename.compareTo(e2.ename) > 0) {
				return 1;
			} else {
				return -1;
			}
		}
		if (o1 instanceof Employee && o2 instanceof Students) {
			Employee e1 = (Employee) o1;
			Students s2 = (Students) o2;
			if (e1.ename.compareTo(s2.name) > 0) {
				return 1;
			} else {
				return -1;
			}
		}
		return 0;
	}

}
