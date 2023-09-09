package sendRedirect;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class add extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int sum = num1 + num2;
		
		res.sendRedirect("square?sum=" + sum);
	}
}
