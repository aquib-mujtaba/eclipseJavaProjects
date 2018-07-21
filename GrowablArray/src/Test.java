public class Test {
	public static void main(String[] args) {
		Example nc = new Example();
		nc.add("Hello World");
		nc.add(0.54F);
		nc.add(4646466);
		nc.add(9898989889L);
		nc.add('a');
		nc.add(7.56);
		nc.add(7.56D);
		nc.add(7.5654664546555546564546654654654654654654654654);
		nc.add(75654664546555546564546654654654654654654654654D);
		nc.add(true);
		// nc.add(false);
		// nc.add("ewe");
		// nc.show();
		/*
		 * int n; // System.out.println("Enter Index number"); Scanner k=new
		 * Scanner(System.in); n=k.nextInt();
		 */
		// Object o =nc.display(n);
		// System.out.println("Elemnt Of Array at index "+n+"="+o);
		// nc.remove(2);
		nc.insert(10, "Aquib");
		System.out.println("Size Of Array is=" + nc.size());
		System.out.println("Capacity Of Array is=" + nc.capacity());
		// nc.replace(2, "aquib");
		nc.show();

	}
}
