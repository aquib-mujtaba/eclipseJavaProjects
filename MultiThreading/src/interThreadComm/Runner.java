package interThreadComm;

public class Runner {

	public static void main(String[] args) throws InterruptedException {
		Account ac = new Account(3000);
		Thread t = new Thread() {
			@Override
			public void run() {
				ac.withdraw(10000);
			}
		};
		Thread t1 = new Thread() {
			@Override
			public void run() {
				ac.deposite(3000);
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				ac.deposite(5000);
			}
		};
		t.start();
		Thread.sleep(3000);
		t1.start();
		Thread.sleep(3000);
		t2.start();
		Thread.sleep(3000);
	}

}
