package org.aquib.genralization.game;

import java.util.Random;

public class PlayGame {
	Game playGame() {
		System.out.println("Your Random choise which want to play==>");
		Random r = new Random();
		int ch = r.nextInt(3);
		if (ch == 0) {
			System.out.println("0");
			Cricket c = new Cricket();
			return c;

		}
		if (ch == 1) {
			System.out.println("1");
			Chess c = new Chess();
			return c;

		}
		if (ch == 2) {
			System.out.println("2");
			Hokey h = new Hokey();
			return h;

		} else {
			return null;
		}
	}
}