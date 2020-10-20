package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		System.out.println("Enter employee Id");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/java","root","Onkar@1495");
			PreparedStatement p=con.prepareStatement("select city,country from employeeAdd  where empid=?");
			p.setInt(1, id);
			ResultSet r=p.executeQuery();
			while(r.next()) {
				System.out.println("city ="+r.getString(1)+"  country ="+r.getString(2));
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
