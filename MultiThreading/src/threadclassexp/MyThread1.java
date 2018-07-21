package threadclassexp;

public class MyThread1 extends Thread {
	Sample s;

	public MyThread1(Sample s) {
		this.s = s;
	}

	@Override
	public void run() {
		s.print();
		System.out.println(Thread.currentThread().getName());
	}
}
