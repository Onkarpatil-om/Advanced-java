package ServletAssignment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet24")
public class Servlet24 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter p=response.getWriter();
		int num1=Integer.parseInt(request.getParameter("num1"));
			int num2=Integer.parseInt(request.getParameter("num2"));
			String radio=request.getParameter("method");
			int result;
			if(radio.equals("add")) {
				result=num1+num2;
				p.println("The sum is = "+result);
			}
			if(radio.equals("sub")) {
				result=num1-num2;
				p.println("The subtract is = "+result);
			}
			if(radio.equals("mul")) {
				result=num1*num2;
				p.println("Multiplication is = "+result);
			}
			if(radio.equals("div")) {
				result=num1/num2;
				p.println("Devide is = "+result);
			}
		
			p.close();
	}

}
