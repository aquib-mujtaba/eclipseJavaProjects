package com.programin.$01_02;

import java.util.Scanner;

public class LeastDegreeBtwMintHrHand {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Hour ");
		int hr = sc.nextInt();
		int mt = sc.nextInt();
		double hAngel = hr * 30 + mt * .5;
		double mAngel = mt * 6;
		double angel = 0;
		if (hAngel > mAngel) {
			angel = hAngel - mAngel;
		} else {
			angel = mAngel - hAngel;
		}
		if (angel > 180) {
			angel = 360 - angel;
		}
		System.out.println("Angel B/w Hour and Mint =" + angel);
	}

}
