package com.aquib.constructer_overloading;

public class Runner {

	public static void main(String[] args) {
		City c = new City();
		City c1 = new City(560029);
		City c2 = new City("Bangalore");
		City c3 = new City(560029, "Banglore");
		System.out.println("NAME " + c1.name + " and Pincode " + c1.pinCode);
		System.out.println("NAME " + c2.name + " and Pincode " + c2.pinCode);
		System.out.println("NAME " + c3.name + " and Pincode " + c3.pinCode);
		System.out.println("NAME " + c.name + " and Pincode " + c.pinCode);

	}

}
