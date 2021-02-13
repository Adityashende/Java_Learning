package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ReadServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/length");
		ServletContext sct = req.getServletContext();
		sct.setAttribute("Context", 1200);
		req.setAttribute("rval", 1100);
		RequestDispatcher rd= req.getRequestDispatcher("xyz");
		rd.forward(req, res);
		pw.close();
	}
}
