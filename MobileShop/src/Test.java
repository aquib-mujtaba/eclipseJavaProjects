public class Test {

	public static void main(String[] args) {
		Shop s = new Shop();
		Mobile m = s.sell();
		System.out.println("Selled phone is " + m.name);
		System.out.println("Selled phone price is " + m.price);
		System.out.println("Phone is selled by =" + s.Sname + "= Shop");
	}

}
