package com.programin.$24_01.assig;

import java.util.Scanner;

public class DeseriumNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = sc.nextInt();
		sc.close();
		boolean rs = isDeserium(n);
		if (rs) {
			System.out.println(n + " Number is Deserium Number");
		} else {
			System.out.println(n + " Number is not Deserium");
		}
	}

	private static boolean isDeserium(int n) {
		int sum = 0, t = n;
		int ct = count(t);
		while (ct > 0) {
			int r = t % 10;
			sum = sum + pow(r, ct);
			t = t / 10;
			ct--;
		}
		System.out.println(" sum=" + sum);
		return sum == n;
	}

	private static int pow(int r, int ct) {
		int p = 1;
		if (ct > 1) {
			while (ct > 0) {
				p = p * r;
				ct--;
			}
		}
		return p;
	}

	private static int count(int t) {
		int count = 0;
		while (t != 0) {
			t = t / 10;
			count++;
		}
		return count;
	}

}
