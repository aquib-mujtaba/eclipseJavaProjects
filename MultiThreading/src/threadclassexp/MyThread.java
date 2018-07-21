package threadclassexp;

public class MyThread extends Thread {
	Sample s;

	public MyThread(Sample s) {
		this.s = s;
	}

	@Override
	public void run() {
		s.display();
		System.out.println(Thread.currentThread().getName());
	}
}
