package com.programin.$08_02.arraryReverse;

public class Reverse {

	public static void main(String[] args) {
		AraryOpration ao = new AraryOpration();
		int x[] = ao.readArrary();
		System.out.println("Arrary Before Swaping ");
		ao.disArray(x);
		ao.reverseArrary(x);
		System.out.println("Array after Reverse is ");
		ao.disArray(x);
	}

}
