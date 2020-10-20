package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q3 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/java","root","Onkar@1495");
			Statement s=con.createStatement();
			String sql="select * from student";
			ResultSet r=s.executeQuery(sql);
			while(r.next()) {
				System.out.println("Rollno is   "+r.getInt(1)+"  name is  "+r.getString(2)+"	marks is "+r.getInt(3)+"	DOB is "+r.getString(4));
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
