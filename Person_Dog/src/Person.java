public class Person {
	String pName = "SARDARJI";

	void giveBiscut() {
		Biscut b = new Biscut();
		Dog d = new Dog();
		d.eat(b);
		System.out.println(pName + " is giveing " + b.bName + " Biscuit to " + d.dName);
	}
}
