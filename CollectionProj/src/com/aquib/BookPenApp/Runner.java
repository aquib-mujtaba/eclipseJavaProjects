package com.aquib.BookPenApp;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Runner {
	static Scanner sc = new Scanner(System.in);

	static Book readBook() {
		System.out.println("Book datails Id||Name||Price");
		return new Book(sc.nextInt(), sc.next(), sc.nextInt());
	}

	static Pen readPen() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pen datails|| Id || Name|| Price");
		return new Pen(sc.nextInt(), sc.next(), sc.nextInt());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList ls = new LinkedList();

		while (true) {
			System.out.println("1.Book \n 2.pen \n 3. Dispaly  ");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				bookOpration(ls);
				break;
			case 2:
				penOpration(ls);
				break;
			default:
				System.out.println("Wrong input");
				break;
			case 3:
				Iterator it = ls.iterator();
				if (it.hasNext()) {
					while (it.hasNext()) {
						System.out.println(it.next());
					}
				} else {
					System.out.println("No element Present");
				}

			}
			System.out.println("Do you want to continue");
			String rs = sc.next();
			if (rs.equalsIgnoreCase("NO")) {
				break;
			}
		}
	}

	private static void bookOpration(LinkedList ls) {
		System.out.println(" 1. Add \n 2. Delete Book  \n 3. Display Book ");
		System.out.println("Enter Your choice");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Entet book Info:");
			ls.add(readBook());
			break;
		case 2:
			System.out.println("Enter the book id");
			int id = sc.nextInt();
			for (Object obj : ls) {
				if (obj instanceof Book) {
					Book b = (Book) obj;
					if (b.bid == id) {
						ls.remove(b);
						System.out.println("Sucssefully deleted");
					} else {
						System.out.println(" No book present with this id");
					}
				}
			}
			break;
		case 3:
			System.out.println("Enter the book id to display");
			int di = sc.nextInt();
			for (Object obj : ls) {
				if (obj instanceof Book) {
					Book b = (Book) obj;
					if (b.bid == di) {
						System.out.println(b);
						System.out.println("Sucssefully Display");
					} else {
						System.out.println("No Book with this id");
					}
				}
			}
			break;
		}
	}

	private static void penOpration(LinkedList ls) {

		System.out.println(" 1. Add \n 2. Delete Pen  \n 3. Display Pen ");
		System.out.println("Enter Your choice");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Entet Pen Info:");
			ls.add(readPen());
			break;
		case 2:
			System.out.println("Enter the Pen id");
			int id = sc.nextInt();
			for (Object obj : ls) {
				if (obj instanceof Pen) {
					Pen b = (Pen) obj;
					if (b.pid == id) {
						ls.remove(b);
						System.out.println("Sucssefully deleted");
					} else {
						System.out.println(" No Pen present with this id");
					}
				}
			}
			break;
		case 3:
			System.out.println("Enter the Pen id to display");
			int di = sc.nextInt();
			for (Object obj : ls) {
				if (obj instanceof Pen) {
					Pen b = (Pen) obj;
					if (b.pid == di) {
						System.out.println(b);
						System.out.println("Sucssefully Display");
					} else {
						System.out.println("No Pen with this id");
					}
				}
			}
			break;
		}
	}
}
