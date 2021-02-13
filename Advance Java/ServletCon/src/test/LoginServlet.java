package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;

public class LoginServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String username= req.getParameter("name");
		String password=req.getParameter("pass");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?allowPublicKeyRetrieval=true&useSSL=false","Aditya", "root");
			PreparedStatement ps = cn.prepareStatement("select * from login where username=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs= ps.executeQuery();
			if(rs.next()){
				pw.println("Login Successful");
				RequestDispatcher rd = req.getRequestDispatcher("dis");
				rd.forward(req, res);
			}else {
				pw.println("Invalid UserLogin");
				RequestDispatcher rd = req.getRequestDispatcher("Login");
				rd.include(req, res);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}


