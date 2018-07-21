import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SavePointEx {
	public static void main(String[] args) {
		try {
			Connection con = null;
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
			Statement st = con.createStatement();
			System.out.println("=======Transection begain======");
			con.setAutoCommit(false);
			st.executeUpdate("insert into ka_party values('rahul','handpary')");
			st.executeUpdate("insert into ka_party values('new Person','flowerparty')");
			Savepoint sp = con.setSavepoint();
			st.executeUpdate("insert into ka_party values('raghu','newParty') ");
			con.rollback(sp);
			System.out.println("Roll Back Sucssesfully");
			con.commit();
			System.out.println("Commited");
		} catch (SQLException ex) {
			Logger.getLogger(SavePointEx.class.getName()).log(Level.SEVERE, null, ex);
		}

	}
}
