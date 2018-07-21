public class StrongNumber {

	public static void main(String[] args) {
		for (int i = 1; i <= 200; i++) {
			if (isStrong(i)) {
				System.out.println("Strong number=" + i);
			}
		}
	}

	private static boolean isStrong(int i) {
		int sum = 0, t = i;
		while (i != 0) {
			int r = i % 10;
			sum = sum + fact(r);
			i = i / 10;
		}
		return sum == t;
	}

	private static int fact(int r) {
		int fact = 1;
		for (int i = 1; i <= r; i++) {
			fact = fact * i;
		}
		return fact;
	}

	private static int count(int n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

	int a = 45;

}
