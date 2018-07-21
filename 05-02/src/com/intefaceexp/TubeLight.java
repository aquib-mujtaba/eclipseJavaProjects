package com.intefaceexp;

public class TubeLight implements Switch {
	@Override
	public void SwtichOn() {
		System.out.println("Tube Swithes off");
	}

	@Override
	public void SwtichOff() {
		System.out.println("Tube is switch on");

	}

}
