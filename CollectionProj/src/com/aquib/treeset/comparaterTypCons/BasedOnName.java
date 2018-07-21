package com.aquib.treeset.comparaterTypCons;

import java.util.Comparator;

public class BasedOnName implements Comparator {
	public int compare(Object n1, Object n2) {
		Employee e1 = (Employee) n1;
		Employee e2 = (Employee) n2;
		if (e1.ename.compareTo(e2.ename) > 0) {
			return 1;
		} else {
			return -1;
		}
	}
}
