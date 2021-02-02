package com.info.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SevletConfig extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException  
		   {  
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		ServletConfig cnfig=getServletConfig();//first create object of servletconfig
		
		String name=cnfig.getInitParameter("name");
		pw.print("Driver is: "+name);  
        
	    pw.close();  
		
		
		   }
}
