package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;
public class RegisterServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 102831973239L;
-
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
//		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<h2> Welcome to Register Servlet<h2>");
		
		
		
	}

}
