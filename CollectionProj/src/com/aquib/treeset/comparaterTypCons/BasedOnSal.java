package com.aquib.treeset.comparaterTypCons;

import java.util.Comparator;

public class BasedOnSal implements Comparator {

	@Override
	public int compare(Object s1, Object s2) {
		Employee e1 = (Employee) s1;
		Employee e2 = (Employee) s2;
		if (e1.sal < e2.sal) {
			return 1;
		} else {
			return -1;
		}
	}

}
