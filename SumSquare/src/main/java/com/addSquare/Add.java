package com.addSquare;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Add extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int sum = num1 + num2;
		
		req.setAttribute("sum", sum);
		RequestDispatcher rd = req.getRequestDispatcher("square");
		rd.forward(req, res);
	}
}
