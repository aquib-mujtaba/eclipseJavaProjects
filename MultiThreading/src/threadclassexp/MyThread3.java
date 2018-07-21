package threadclassexp;

public class MyThread3 extends Thread {
	Sample s;

	public MyThread3(Sample s) {
		this.s = s;
	}

	@Override
	public void run() {
		s.pr();
	}
}
