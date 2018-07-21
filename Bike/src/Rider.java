public class Rider {
	void riderBike() {
		System.out.println("Rider wants to ride bike");
		Bike bk = new Bike();
		Fuel farg = new Fuel();
		bk.startAndMove(farg);
		System.out.println("Rider ride the bike");

	}

	public static void main(String[] args) {
		System.out.println("App Start");
		Rider r = new Rider();
		r.riderBike();
	}
}
