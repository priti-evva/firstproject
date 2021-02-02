package com.capgemini.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements  InitializingBean,DisposableBean {
	private int empNumber;
	
	private String name;
	


	public Employee() {
		super();
		System.out.println("Empty Constructor is called");
	}
	
	
	
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



	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}

	

}
