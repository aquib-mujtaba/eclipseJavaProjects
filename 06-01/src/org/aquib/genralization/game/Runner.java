package org.aquib.genralization.game;

public class Runner {

	public static void main(String[] args) {
		PlayGame pg = new PlayGame();
		Game g = pg.playGame();
		if (g instanceof Cricket) {
			((Cricket) g).play();
		}
		if (g instanceof Hokey) {
			((Hokey) g).play();
		}
		if (g instanceof Chess) {
			((Chess) g).play();
		}
	}

}
