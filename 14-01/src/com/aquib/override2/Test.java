package com.aquib.override2;

public class Test {

	public static void main(String[] args) {
		Parrent p = new Child();
		System.out.println(((Child) p).sal);
		((Child) p).m1();
		p.m();
		p.me();
		// p.m();
		// Child c = (Child) p;
		// System.out.println(c.sal);

		// c.m1();
	}

}
