package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DisplayServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		ServletContext sct = req.getServletContext();
		Integer cval = (Integer)sct.getAttribute("cval");
		Integer rval = (Integer)req.getAttribute("rval");
		pw.println("<br>-----Dis from Display Servlet------");
		pw.println("<br>cval: "+cval+"<br>");
		pw.println("<br>rval: "+rval+"<br>");
	}
}
