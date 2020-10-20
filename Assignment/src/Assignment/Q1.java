package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Q1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/java","root","Onkar@1495");
			Statement s=con.createStatement();
			String sql="create table student(rollno int(20) primary key,sname varchar(20),marks int(7),DOB DATE)";
			s.execute(sql);
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
