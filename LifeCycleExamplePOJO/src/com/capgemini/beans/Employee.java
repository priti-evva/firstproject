package com.capgemini.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee{
	private int empNumber;
	
	private String name;
	


	
	
	public int getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void init()
	{
		System.out.println("From init method");
	}
	
	public void destroy()
	{
		System.out.println("From destroy");
	}

	

	

}
