
public class Runner {

	public static void main(String[] args) {
		FruitShop fs = new FruitShop();
		Fruit f = fs.sell();
		if (f instanceof Apple) {
			((Apple) f).type();
		} else {
			((Mango) f).mangoType();
		}
	}

}
