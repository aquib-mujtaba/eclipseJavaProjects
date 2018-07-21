
public class Q6Pattern {
	public static void main(String[] args) {
		int n = 4, k = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(k);
				k++;
			}
			System.out.println();
		}

	}
}
