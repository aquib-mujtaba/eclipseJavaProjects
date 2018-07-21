package org.aquib.genralization.vendingmachine;

public class Runner {

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		Bevrage b = vm.gives();
		if (b instanceof Milk) {
			Milk m = (Milk) b;
			m.make();
		}
		if (b instanceof Tea) {
			Tea t = (Tea) b;
			t.make();
		}
		if (b instanceof Cofee) {
			Cofee c = (Cofee) b;
			c.make();
		}

	}

}
