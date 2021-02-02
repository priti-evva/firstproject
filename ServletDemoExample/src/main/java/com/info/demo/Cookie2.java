package com.info.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookie2 extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	{
		
		try {
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			Cookie ck[]=req.getCookies();  
		    pw.print("Hello "+ck[0].getValue());  
		  
		    pw.close();  
		  
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
