package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet  extends HttpServlet{
	
	public DemoServlet(){
		System.out.println("Servlet Object Created !!!");
	}
	

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println(" Service #############");
		//B.L
		
		
		//Retrun Output
		//PrintWriter out = resp.getWriter();
		String output = new Date().toString(); // B.L Output
		
		RequestDispatcher rd = req.getRequestDispatcher("output.jsp");
		req.setAttribute("date", output);
		rd.forward(req, resp);
		
		
		//out.println("<html><head><title>Demo Servlet</title></head><body><h1><font color=\"red\">Demo Servlet " + new Date()+"</font><h1></body></html>");
	}
	
	
}
