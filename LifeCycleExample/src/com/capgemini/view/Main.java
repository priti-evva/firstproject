package com.capgemini.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.beans.Employee;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		applicationContext.registerShutdownHook();
		
		System.out.println("After application context container");
		  Employee emp = applicationContext.getBean("emp", Employee.class);
		  
		 
		System.out.println(emp.getEmpNumber());
		System.out.println(emp.getName());
		
		

//		Employee emp2=context.getBean("emp",Employee.class);//creating obj by passing class in parameter
//		
//	
//		System.out.println(emp2.getEmpNumber());
//		System.out.println(emp2.getName());
//	

	}

}
