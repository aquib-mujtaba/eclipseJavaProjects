package syncexp;

public class Printer {
	synchronized void print(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "*" + i + "==" + n * i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
