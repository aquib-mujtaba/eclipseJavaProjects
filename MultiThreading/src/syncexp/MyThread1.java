package syncexp;

public class MyThread1 extends Thread {
	Printer p = new Printer();

	@Override
	public void run() {
		p.print(100);
	}
}
