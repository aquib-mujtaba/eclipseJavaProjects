package $22_03;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter your number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (isPrime(n, 2)) {
			System.out.println("Primer Number");
		} else
			System.out.println("Not Prime Number");
	}

	private static boolean isPrime(int n, int i) {
		if (i > n / 2)
			return true;
		if (n % i == 0) {
			return false;
		}
		return isPrime(n, i + 1);
	}
}
