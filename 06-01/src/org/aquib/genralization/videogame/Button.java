package org.aquib.genralization.videogame;

import java.util.Random;

public class Button {
	Wapon clickButton() {
		System.out.println(" Button Cliked");
		Random rd = new Random();
		int ch = rd.nextInt(4);
		if (ch == 0) {
			Bomb b = new Bomb();
			return b;
		}
		if (ch == 1) {
			Gun g = new Gun();
			return g;
		}
		if (ch == 2) {
			Knife k = new Knife();
			return k;
		}
		if (ch == 3) {
			BowArrow b = new BowArrow();
			return b;
		} else {
			return null;
		}
	}
}
