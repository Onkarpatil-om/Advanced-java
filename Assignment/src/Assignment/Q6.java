package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Q6 {

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
		//System.out.println(rollno+name+mark+dob);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/java","root","Onkar@1495");
			Statement s=con.createStatement();
			String sql="insert into student values("+rollno+",'"+name+"',"+mark+",'"+dob+"')";
			s.execute(sql);
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
