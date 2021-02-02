package com.info.demo;

import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AttributeServlet1 extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse res)  
	{  
	try{  
	res.setContentType("text/html");  
	PrintWriter out=res.getWriter();
	ServletContext context=getServletContext();
	String s=(String)context.getAttribute("company");
	out.println("welcome to"+s);
	out.close();
	}catch(Exception e) {
		PrintWriter out = null;
		out.println(e);
	}
	}
	

	
	
}
