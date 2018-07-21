public class Shop {
	Product[] sell() {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product[] parr = { p1, p2, p3 };
		return parr;
	}

	public static void main(String[] args) {
		Shop s = new Shop();
		Product[] s1 = s.sell();
		Product p1 = s1[0];
		System.out.println(p1.name);
	}

}
