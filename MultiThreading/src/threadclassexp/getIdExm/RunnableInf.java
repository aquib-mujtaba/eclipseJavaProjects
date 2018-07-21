package threadclassexp.getIdExm;

public class RunnableInf {
	public static void main(String[] args) {
		Thread t = new Thread(new MyThred(), "Aquib");
		Thread t2 = new Thread(new MyThred(), "Mujtaba");
		t.start();
		t2.start();
	}
}
