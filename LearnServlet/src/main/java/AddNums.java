import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddNums extends HttpServlet {
	public void service (HttpServletRequest req, HttpServletResponse res) throws IOException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		int sum = a + b;
		PrintWriter out = res.getWriter();
		out.println("sum is " + sum);
	}
}
