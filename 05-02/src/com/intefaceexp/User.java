package com.intefaceexp;

public class User {
	public static void main(String[] args) {
		TubeLight tl = new TubeLight();
		tl.SwtichOn();
		tl.SwtichOff();
		LedLight l = new LedLight();
		l.SwtichOff();
		l.SwtichOn();
	}
}
