package ServletAssignment;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddServletQ31")
public class AddServletQ31 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bno=Integer.parseInt(request.getParameter("bno"));
		String bname=request.getParameter("bname");
		String author=request.getParameter("author");
		int price=Integer.parseInt(request.getParameter("price"));
		String pb=request.getParameter("pub");
		String date=request.getParameter("dp");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/java","root","Onkar@1495");
			PreparedStatement c=con.prepareStatement("insert into Book values(?,?,?,?,?,?)");
			c.setInt(1, bno);
			c.setString(2, bname);
			c.setInt(4, price);
			c.setString(3, author);
			c.setString(5,pb);
			c.setString(6, date);
			c.executeUpdate();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.setContentType("text/html");
		PrintWriter p=response.getWriter();
		p.println("<a href="+"ListBookQ30"+"><h2>Book List</h2></a>");
	}
		
}
