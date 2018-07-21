package org.aquib.hotel;

public class Runner {
	public static void main(String[] args) {
		Hotel h = new Hotel();
		Food f = h.serve();
		if (f instanceof Biryani) {
			((Biryani) f).gives();
		}
		if (f instanceof Dosha) {
			((Dosha) f).gives();
		}
		if (f instanceof Edli) {
			((Edli) f).gives();
		}
		if (f instanceof Roti) {
			((Roti) f).gives();
		}
	}
}
