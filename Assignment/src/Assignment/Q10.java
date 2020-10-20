package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Q10 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/java","root","Onkar@1495");
			Statement s=con.createStatement();
			ResultSet r=s.executeQuery("select * from student");
			ResultSetMetaData rs=r.getMetaData();
			int i=rs.getColumnCount();
			System.out.println("no of column is "+i);
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
