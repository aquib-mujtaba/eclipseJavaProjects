package threadclassexp;

public class Runner {

	public static void main(String[] args) throws InterruptedException {
		Sample s = new Sample();
		MyThread mt = new MyThread(s);
		MyThread1 mt1 = new MyThread1(s);
		MyThread3 mt3 = new MyThread3(s);
		// Thread t3 = new Thread(new MyThred());
		mt3.start();
		mt1.start();
		Thread.sleep(500);
		mt1.join();
		mt.start();

		/*
		 * Thread t = new Thread() {
		 * 
		 * @Override public void run() { for (int i = 1; i <= 10; i++) {
		 * System.out.println(i * 10); try { Thread.sleep(100); } catch
		 * (InterruptedException e) { e.printStackTrace(); } } } }; t.start();
		 */

		/*
		 * Thread t = Thread.currentThread(); System.out.println(t.getName());
		 * System.out.println(t.getId()); System.out.println(t.getPriority());
		 */
		// Thread t1 = new Thread();
		/*
		 * System.out.println(t1.getName()); System.out.println(t1.getId());
		 * System.out.println(t1.getPriority()); t.setName("Aquib");
		 * System.out.println("============="); System.out.println(t.getName());
		 * System.out.println(t.getId()); System.out.println(t.getPriority());
		 * System.out.println("============"); System.out.println(t1.getName());
		 * System.out.println(t1.getId()); System.out.println(t1.getPriority());
		 * System.out.println("============="); System.out.println(t.getName());
		 * System.out.println(t.getId()); System.out.println(t.getPriority());
		 */
		/*
		 * MyThread t = new MyThread(); t.start(); // Thread.sleep(200); // t.stop(); //
		 * t.start(); System.out.println("-----");
		 */
	}

}
