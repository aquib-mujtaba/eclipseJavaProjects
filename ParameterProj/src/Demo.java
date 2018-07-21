public class Demo {
	final double PIE = 3.142;

	double AreaOfircle(double r) {
		double area = PIE * r * r;
		return area;
	}

	double Perimeter(double r) {
		double parimeter = 2 * PIE * r;
		return parimeter;
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		// System.out.println("area of circle is=" + d.AreaOfircle(5.1));
		double a = d.AreaOfircle(5.2);
		System.out.println("Area of circle is=" + a);
	}
}
