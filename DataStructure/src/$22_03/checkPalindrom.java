package $22_03;

import java.util.Scanner;

public class checkPalindrom {
	public static void main(String[] args) {
		System.out.println("Enter Your String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if (isPalindrom(s, 0, s.length() - 1)) {
			System.out.println("Its palindrom");
		} else {
			System.out.println("Not a palindrom");
		}
	}

	private static boolean isPalindrom(String s, int i, int k) {
		if (s.charAt(i) != s.charAt(k)) {
			return false;
		}
		if (i <= (s.length() / 2) - 1) {
			isPalindrom(s, i + 1, k - 1);
		}
		return true;
	}
}
