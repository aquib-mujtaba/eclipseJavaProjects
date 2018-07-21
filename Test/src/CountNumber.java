import java.util.Scanner;

public class CountNumber {
	public static void main(String[] args) {
		System.out.println("Enter your Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = countDigits(n);
		System.out.println("Total digits in number =" + c);
	}

	private static int countDigits(int n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		return count;
	}
}
