package threadclassexp;

public class Sample {
	public void display() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("10*" + i + "=" + 10 * i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void pr() {
		for (int i = 1; i <= 10; i++)
			System.out.println("pp" + i);
	}

	public void print() {
		for (int i = 1; i <= 1000; i++) {
			if (i % 100 == 0) {
				System.out.println(i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
