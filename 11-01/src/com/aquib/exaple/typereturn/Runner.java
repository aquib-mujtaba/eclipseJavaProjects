package com.aquib.exaple.typereturn;

public class Runner {

	public static void main(String[] args) {
		Website w = new Website();
		Gift g = w.registerAndTakeGift();
		if (g instanceof Mobile) {
			((Mobile) g).call();
			System.out.println("Mobile instace | Call()");
		}
		if (g instanceof Perfume) {
			((Perfume) g).spary();
			System.out.println("Perfume instace | spray()");
		}
		if (g instanceof Chocolate) {
			((Chocolate) g).eat();
			System.out.println("Chocolate instace | eat()");
		}
	}

}
