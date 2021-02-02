package com.info.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RDLoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)  
	        throws ServletException, IOException { 
		
		res.setContentType("text/html");
		PrintWriter write=res.getWriter();
		String n=req.getParameter("userName");
		String p=req.getParameter("userPass");
		if(p.equals("piya")) {
			RequestDispatcher d=req.getRequestDispatcher("welcome");
			d.forward(req, res);
		}
		else {
		write.print("Sorry UserName or Password Error!");  
	        RequestDispatcher rd=req.getRequestDispatcher("/login.html");  
	        rd.include(req, res);  
	                      
		}
		
		
	}
	  

}
