package com.aquib.treeset.noArgCons;

import java.util.Iterator;
import java.util.TreeSet;

public class Runner {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(12);
		// ts.add("aq"); // Heterogeneous are not allowed.-Run Time Error
		// ts.add("der");// Heterogeneous are not allowed.- RunTime Error
		// ts.add(12.12);// //Double can't be compare with integer.-RunTime Error
		ts.add(15);
		ts.add(1562);
		ts.add(120);
		Iterator it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
