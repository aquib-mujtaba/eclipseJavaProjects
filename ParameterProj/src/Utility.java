public class Utility {
	void calculateAreaOfCircle(double r) {
		final double PIE = 3.142;
		double area = PIE * r * r;
		System.out.println("Area of circele is=" + area);
	}

	public static void main(String[] args) {
		Utility o = new Utility();
		o.calculateAreaOfCircle(93.2);
		double r = 1.0;
		o.calculateAreaOfCircle(r);
	}

}
