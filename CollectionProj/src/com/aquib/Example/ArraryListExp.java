package com.aquib.Example;

import java.util.ArrayList;

public class ArraryListExp {
	public static void main(String[] args) {
		ArrayList ar = new ArrayList(6);
		ar.add("Aquib");
		ar.add(98);
		ar.add(2.54);
		ar.add(4.7f);
		ar.add(4.778);
		ar.add(false);
		ar.add("Aquib");
		System.out.println(ar);
		System.out.println("Size=" + ar.size());
		System.out.println("elenment at the the 4=" + ar.get(4));
		System.out.println("element removed =" + ar.remove(0));
		System.out.println("elenment at the the 4=" + ar.get(4));
		System.out.println("elenment at the the 1=" + ar.get(1));
		System.out.println("elenment override at 1=" + ar.set(1, "mujt"));
		System.out.println(" new elenment at the 1=" + ar.get(1));
		System.out.println(ar);
		System.out.println(" new elenment at the 1=" + ar.get(2));
		ar.add(0, "Aquib");

		System.out.println(" Size =" + ar.size() + "\n" + ar);
		System.out.println(" last in index==" + ar.lastIndexOf("Aquib"));
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("===========================");
		Object ob[] = ar.toArray();
		for (int i = 0; i < ob.length; i++) {
			System.out.println(ob[i]);
		}
		System.out.println("==================");
		for (Object s : ob) {
			System.out.println(s);
		}
	}
}
