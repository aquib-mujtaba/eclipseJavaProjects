package org.aquib.genralization.videogame;

public class Runner {

	public static void main(String[] args) {
		Button b = new Button();
		Wapon w = b.clickButton();
		if (w instanceof Bomb) {
			// Bomb m = (Bomb) w;
			// m.got();
			((Bomb) w).got();
			((Bomb) w).blast();
		}
		if (w instanceof Gun) {
			// Gun m = (Gun) w;
			// m.got();
			((Gun) w).got();
			((Gun) w).shoot();
		}
		if (w instanceof Knife) {
			// Knife m = (Knife) w;
			// m.got();
			((Knife) w).got();
			((Knife) w).stab();
		}
		if (w instanceof BowArrow) {
			// BowArrow m = (BowArrow) w;
			// m.got();
			((BowArrow) w).got();
		}
	}

}
