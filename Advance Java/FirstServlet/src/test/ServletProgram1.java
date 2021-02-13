package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/pqr") 

public class ServletProgram1 extends HttpServlet {
	
	public void init() {}
	

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		
		PrintWriter pw= res.getWriter();
		res.setContentType("text/html");
		pw.println("Welcome to servlet programming");
	}
	public void destroy() {}
}
