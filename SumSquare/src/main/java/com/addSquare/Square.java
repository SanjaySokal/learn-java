package com.addSquare;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Square extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int sum = (int) req.getAttribute("sum");
		int square = sum * sum;
		
		PrintWriter out = res.getWriter();
		out.println("square is " + square);
	}
}
