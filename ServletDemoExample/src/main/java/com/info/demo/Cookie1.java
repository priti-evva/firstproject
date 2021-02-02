package com.info.demo;

import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookie1 extends HttpServlet {

	

	
	public void doPost(HttpServletRequest req, HttpServletResponse res){  
		    try{  
		  
		    res.setContentType("text/html");  
		    PrintWriter out=res.getWriter();
		    
		    String n=req.getParameter("userName");  
		    out.print("Welcome "+n);  
		  
		    Cookie ck=new Cookie("uname",n);//creating cookie object  
		    res.addCookie(ck);;//adding cookie in the response  
		  
		    //creating submit button  
		    out.print("<form action='cook' method='post'>");  
		    out.print("<input type='submit' value='go'>");  
		    out.print("</form>");  
		          
		    out.close();  
		  
		        }catch(Exception e){System.out.println(e);}  
		  }  
	}

