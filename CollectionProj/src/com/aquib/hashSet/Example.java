package com.aquib.hashSet;

import java.util.HashSet;

public class Example {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Hello");
		hs.add("Hello");
		hs.add(56);
		hs.add(96.0);
		hs.add(false);
		System.out.println(hs);
	}

}
