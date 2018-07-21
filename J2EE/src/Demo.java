public class Demo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Class loading sucsse");
		} catch (ClassNotFoundException e) {
			System.out.println("class not found");
		}
	}

}
