package PrimeFactor;

import java.util.Scanner;

public class PrimeFactor {
	public static void main(String[] args) {
		System.out.println("Enter Your number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				if (isPrime(i)) {
					System.out.println(i);
				}
			}
		}
	}

	private static boolean isPrime(int i) {
		int c = 2;
		while (c < i / 2) {
			if (i % c == 0) {
				return false;
			}
			c++;
		}
		return true;
	}

}
