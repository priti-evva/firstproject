package com.capgemini.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee{
	private int empNumber;
	
	private String name;
	
	public Employee()
	{
		System.out.println("from employee constructor");
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

	@PostConstruct
	public void initIt() throws Exception {
	  System.out.println("Init method after properties are set : " );
	}
	
	@PreDestroy
	public void cleanUp() throws Exception {
	  System.out.println("Spring Container is destroy! Customer clean up");
	}	


	

}
