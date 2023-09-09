package sendRedirect;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class square extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int sum = Integer.parseInt(req.getParameter("sum"));
		int square = sum * sum;
		
		PrintWriter out = res.getWriter();
		out.println("square is " + square);
	}
}
