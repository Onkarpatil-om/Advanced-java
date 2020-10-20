package ServletAssignment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet23")
public class Servlet23 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		response.setContentType("text/html");
		PrintWriter p=response.getWriter();
		p.println("<h1 style='color:orange'>Welcome "+name+"</h1>");
		p.flush();
		p.close();
	}

}
