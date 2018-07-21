import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ExampleDbMetaData {
	public static void main(String[] args) {
		try {
			Connection con = null;
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from ka_party");
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println(rsmd.getColumnCount());

			// DatabaseMetaData dbmd = con.getMetaData();
			/*
			 * // System.out.println("Data Base Version " + dbmd.getDatabaseProductName());
			 * // System.out.println("Data Base Name " + dbmd.getDatabaseProductVersion());
			 * // System.out.println("Data Base JDBC/Minor Version " +
			 * dbmd.getJDBCMinorVersion()); // System.out.println("Data Base URL " +
			 * dbmd.getURL());
			 */
		} catch (Exception e) {
			e.getMessage();
		}

	}

}
