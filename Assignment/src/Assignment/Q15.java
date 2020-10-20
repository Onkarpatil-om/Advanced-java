package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		System.out.println("Enter city name");
		Scanner sc=new Scanner(System.in);
		String city=sc.nextLine();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/java","root","Onkar@1495");
			PreparedStatement p=con.prepareStatement("select e.name from employee as e,employeeAdd as e1 where e.empid=e1.empid and city=?");
			p.setString(1, city);
			ResultSet r=p.executeQuery();
			System.out.println(r);
			if(r!=null) {
			while(r.next()) {
				System.out.println("Emp name ="+r.getString(1));
			}}
			else {
				System.out.println("There is no employee in this city");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
