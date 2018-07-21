package com.example.tostring;

public class Example {

	public static void main(String[] args) {
		Mobile m = new Mobile();
		System.out.println(m);
		Employee e = new Employee();
		e.setId(2);
		e.setName("Aquib");
		e.setSal(5000.0);
		System.out.println(e);
	}

}
