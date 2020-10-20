package ServletAssignment;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ListBookQ30")
public class ListBookQ30 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/java","root","Onkar@1495");
			PreparedStatement c=con.prepareStatement("select * from Book");
			response.setContentType("text/html");
			PrintWriter p=response.getWriter();
			ResultSet r=c.executeQuery();
			while(r.next()) {
				p.println(r.getInt(1));
				p.println(r.getString(2));
				p.println(r.getString(3));
				p.println(r.getInt(4));
				p.println(r.getString(5));
				p.println(r.getString(6));
				p.print("<br>");
				p.print("<br>");
			}
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}

}
