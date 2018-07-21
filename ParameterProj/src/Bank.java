public class Bank {

	double deposite(double amnt, double rate, int time) {
		double intrest = (amnt * rate * time) / 100;
		return intrest;
	}

	public static void main(String[] args) {
		Bank b = new Bank();
		double a = 1000;
		double i = b.deposite(a, 7.5, 3);
		System.out.println("Intrest he Got on his deposit =" + i);
		System.out.println("Amout he deposit=" + a);
		System.out.println("Total Amout he get after intrest=" + (a + i));

	}

}
