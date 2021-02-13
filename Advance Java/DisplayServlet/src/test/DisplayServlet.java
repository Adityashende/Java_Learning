package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DisplayServlet extends HttpServlet{
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public void doPost(HttpServletRequest req,HttpServletResponse res) 
		throws ServletException , IOException{
			
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String name  = req.getParameter("Name");
		pw.println("name: "+name);
		
	}
}
