package ConstructerChaining;

class Base {
	int i;

	public Base() {
		i = 20;
		m();
	}

	public void m() {
		i += 10;
		System.out.println("from base" + i);
	}
}

public class Child extends Base {

	public void m() {
		System.out.println(i);
		System.out.println("from child");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.m();
	}

}
