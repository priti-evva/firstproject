package com.info.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendRedirectMysearchServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res)  
			throws ServletException,IOException  
			{  
		String name=req.getParameter("name");  
        res.sendRedirect("https://www.google.co.in/#q="+name);  
		
			}
	
}