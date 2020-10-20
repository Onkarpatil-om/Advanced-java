package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Q12 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/java","root","Onkar@1495");
			PreparedStatement p=con.prepareStatement("insert into employee values (?,?,?,?)");
			p.setInt(1, 3);
			p.setString(2, "abhi shinde");
			p.setDouble(3, 35000.0);
			p.setString(4, "2010-11-01");
			p.execute();
			PreparedStatement p1=con.prepareStatement("insert into employeeAdd values(?,?,?,?)");
			p1.setInt(1, 1);
			p1.setString(2, "kolhapur");
			p1.setString(3, "India");
			p1.setInt(4, 1);
			p1.execute();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
