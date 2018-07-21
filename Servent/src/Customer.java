public class Customer {
	void order() {
		System.out.println("Customer order the bear");
		Servent s = new Servent();
		Bear b = s.serve();
		System.out.println("Servent accept the order \n");
		System.out.println("Customer order Brand--" + b.brand
				+ " Price of order is=" + b.price + "\n");
	}
}
