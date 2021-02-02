package com.capgemini.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.beans.HelloWorld;
import com.capgemini.beans.HelloWorldConfiguration;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		   
	      HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

	      helloWorld.setMessage("Hello World!");
	     System.out.println(helloWorld.getMessage());

	}

}
