package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student data");
		System.out.println("Enter roll no");
		int rollno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name");
		String name=sc.nextLine();
		System.out.println("Enter marks");
		int mark=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter DOB");
		String dob=sc.nextLine();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/java","root","Onkar@1495");
			PreparedStatement p=con.prepareStatement("insert into student values(?,?,?,?)");
			p.setInt(1, rollno);
			p.setString(2, name);
			p.setInt(3, mark);
			p.setString(4, dob);
			p.executeUpdate();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
