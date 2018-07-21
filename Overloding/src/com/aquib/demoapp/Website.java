package com.aquib.demoapp;

public class Website {
	void login(long mob, int otp) {
		System.out.println("User loged in user Moblie number is" + mob);
	}

	void login(String loginid, int pswd) {
		System.out.println("User loged in userid is " + loginid + " password of user is " + pswd);
	}

	public static void main(String[] args) {
		Website w = new Website();
		w.login(88210207L, 125);
		w.login("aquib52", 12335);
	}

}
