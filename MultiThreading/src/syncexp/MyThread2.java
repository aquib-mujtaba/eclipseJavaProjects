package syncexp;

public class MyThread2 extends Thread {
	Printer p = new Printer();

	@Override
	public void run() {
		p.print(10);

	}

}
