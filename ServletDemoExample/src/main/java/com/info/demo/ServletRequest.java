package com.info.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletRequest extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)  
			throws ServletException,IOException  
			{  
		res.setContentType("text/html");
		PrintWriter pwrite=res.getWriter();
		String name=req.getParameter("name");
		pwrite.println(name);
		
			}

}
