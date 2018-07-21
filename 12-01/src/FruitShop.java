import java.util.Random;

public class FruitShop {
	Fruit sell() {
		Random r = new Random();
		int ch = r.nextInt(2);
		if (ch == 0) {
			Mango m = new Mango();
			return m;

		} else {
			Apple a = new Apple();
			return a;
		}
	}
}
