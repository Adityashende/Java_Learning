package test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		req.getRequestDispatcher("link.html").include(req, res);

		String name = req.getParameter("name");
		String password = req.getParameter("password");

		if (password.equals("admin123")) {
			pw.println("You are successfully logged in!!!");
			pw.println("Welcome " + name);

			Cookie ck = new Cookie("name", name);
			res.addCookie(ck);
		} else {

			pw.print("sorry, username or password error!");  
            req.getRequestDispatcher("login.html").include(req, res);  
            
		}
		pw.close();
	}
}
