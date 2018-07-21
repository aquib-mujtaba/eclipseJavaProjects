package ConstructerChaining;

public class Exampl {
	int i;

	public Exampl() {
		i = 20;
		m();
	}

	public void m() {
		i += 10;
		System.out.println("from base");
	}
}
