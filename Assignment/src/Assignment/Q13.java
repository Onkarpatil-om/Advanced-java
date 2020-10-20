package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Q13 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/java","root","Onkar@1495");
			PreparedStatement p=con.prepareStatement("select * from employee as e,employeeAdd as e1 where e.empid=e1.empid");
			ResultSet r=p.executeQuery();
			while(r.next()) {
				System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getDouble(3)+" "+r.getString(4)+
						" "+r.getInt(5)+" "+r.getString(6)+" "+r.getString(7)+" "+r.getInt(8));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
