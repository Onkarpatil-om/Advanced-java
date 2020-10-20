package ServletAssignment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletQ30")
public class ServletQ30 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		
		String gen=request.getParameter("Gen");
		String lan[]=request.getParameterValues("lan");
		
		String city=request.getParameter("city");
		response.setContentType("text/html");
		PrintWriter p=response.getWriter();
		
		if(name!=null) {
			
			if(gen!=null) {
			
		 if(city!=null) {
			 
			if(lan!=null) {
			p.print("<h1>Success</h1>");	
			}
			else {
				response.sendRedirect("Q30.html");
			}

		}else {
			response.sendRedirect("Q30.html");
		}

			}else {
				response.sendRedirect("Q30.html");
			}

	}
		else {
			response.sendRedirect("Q30.html");
		}

}
}
