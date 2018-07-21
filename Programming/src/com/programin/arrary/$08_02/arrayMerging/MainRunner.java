package com.programin.$08_02.arrayMerging;

public class MainRunner {

	public static void main(String[] args) {
		AraryOpration ao = new AraryOpration();
		System.out.println("Enter your First Array ");
		int a[] = ao.readArrary();
		System.out.println("Enter your secound arrary");
		int b[] = ao.readArrary();
		int[] rs = ao.mergeArray(a, b);
		System.out.println("First array Elemernt");
		ao.disArray(a);
		System.out.println("Secound Array Element");
		ao.disArray(b);
		System.out.println("Merged Array Element");
		ao.disArray(rs);

	}

}
