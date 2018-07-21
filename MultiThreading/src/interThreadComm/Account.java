package interThreadComm;

public class Account {
	int bal;

	Account(int bal) {
		this.bal = bal;
	}

	synchronized void deposite(int amt) {
		bal += amt;
		System.out.println(+amt + " Deposited Sucssefully");
		notify();
	}

	synchronized void withdraw(int amt) {
		if (bal < amt) {
			System.out.println("Low Balance");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			withdraw(amt);
		}

		bal -= amt;
		System.out.println("Withdraw Sucssefully");
		System.out.println("Avalable balance is " + bal);
		System.exit(0);
	}
}
