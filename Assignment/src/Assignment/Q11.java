package Assignment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Q11 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/java","root","Onkar@1495");
			CallableStatement c=con.prepareCall("{call sp_insert(?,?,?,?)}");
			c.setInt(1, 107);
			c.setString(2, "nikita patil");
			c.setInt(3, 89);
			c.setString(4, "1997-12-14");
			c.execute();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
