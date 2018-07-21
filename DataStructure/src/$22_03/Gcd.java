package $22_03;

import java.util.Scanner;

public class Gcd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int m = sc.nextInt();
		System.out.println("Enter Secound Number");
		int n = sc.nextInt();
		int r = gcd(m, n);
		System.out.println("Your GCD Number is " + r);
	}

	private static int gcd(int m, int n) {
		if (m > n) {
			gcd(n, m);
		}
		if (m == 0) {
			return n;
		}
		return gcd(n % m, m);
	}
}
