package com.programin.arrary.$15_02.Q39;

public class FstAndSndBiggestNumber {

	public static void main(String[] args) {
		int ar[] = { 56, 78, 18, 89, 32, 53, 89, 78 };
		int fbig = ar[0];
		int sbig = ar[1];
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] > fbig) {
				sbig = fbig;
				fbig = ar[i];
			} else if (ar[i] > sbig && ar[i] != fbig) {
				sbig = ar[i];
			}
		}
		System.out.println("first biggest number =" + fbig);
		System.out.println("second biggest number =" + sbig);
	}

}
