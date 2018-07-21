package com.aquib.demoapp;

import java.util.Random;

public class RNdemo {

	public static void main(String[] args) {
		Random rn = new Random();
		int n1 = rn.nextInt();
		int n2 = rn.nextInt(3);
		System.out.println(n1 + " " + n2);
	}

}
