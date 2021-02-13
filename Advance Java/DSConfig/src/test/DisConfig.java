package test;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

public class DisConfig extends GenericServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int count = 10;
	public void init(ServletConfig sc) {
		count = Integer.parseInt(sc.getInitParameter("count"));
	}
	
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("value of count: "+count); 
		pw.close();
	}
	
	public void destroy() {}
}
//