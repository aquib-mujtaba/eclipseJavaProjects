package com.programin.example.static_method_overridExmp;

public class Runner {
	public static void main(String[] args) {
		Parrent obj1 = new Child();
		// obj1.display();
		Child.display();
		// System.out.println(Child.x);

		obj1.display();

		// As per overriding rules this should call to class Derive's static
		// overridden method. Since static method can not be overridden, it
		// calls Base's display()
		// obj1.print();
		// Here overriding works and Derive's print() is called
	}
}
