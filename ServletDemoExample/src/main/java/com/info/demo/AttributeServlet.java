package com.info.demo;

import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AttributeServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res)  
	{  
	try{  
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		ServletContext obj=req.getServletContext();
		obj.setAttribute("company", obj);
	    pw.println("Welcome to first servlet");  
		pw.println("<a href='AttributeServlet1'>visit</a>");  
		pw.close();  
		  
	}catch(Exception e) {
	
	}
	}
}
	
	
	
	  


