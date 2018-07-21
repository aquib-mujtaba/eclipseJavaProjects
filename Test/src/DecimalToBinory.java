import java.util.Scanner;

public class DecimalToBinory {

	public static void main(String[] args) {
		System.out.println("Enter your Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		toBinory(n);

	}

	private static void toBinory(int n) {
		while (n != 0) {
			if (n % 2 == 1) {
				System.out.print("1");
			} else {
				System.out.print("0");
			}
			n = n / 2;
		}

	}
}
