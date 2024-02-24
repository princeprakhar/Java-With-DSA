import javax.servlet.*;
import java.io.*;
public class servlet extends GenericServlet
{
	public void Service(ServletRequest req,SevrletResponse resp)throws IOException,ServletException
	{	
		PrintWriter out =res.getWriter();
		out.print("helloand welcome to servlet");
	}
}	