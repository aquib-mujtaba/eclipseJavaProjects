package syncexp;

public class Runner {

	public static void main(String[] args) {
		MyThread1 t = new MyThread1();
		MyThread2 t2 = new MyThread2();
		t.start();
		t2.start();
	}

}
