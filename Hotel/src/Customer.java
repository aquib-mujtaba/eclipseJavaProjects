public class Customer {
	public static void main(String[] args) {
		Hotel h = new Hotel();
		Food f = h.serve();
		System.out.println(f);
	}

}
