package com.aquib.exaple.objectreturn;

public class Runner {

	public static void main(String[] args) {
		ReturnObject ro = new ReturnObject();

		Animal a = ro.returnType();
		if (a instanceof Dog) {
			System.out.println("its return Dog");
		}
		if (a instanceof Cow) {
			System.out.println("its return Cow");
		}
		if (a instanceof Tiger) {
			System.out.println("its return Tiger");
		}
	}

}
