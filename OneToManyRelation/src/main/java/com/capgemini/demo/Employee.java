package com.capgemini.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee1")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int employeeId;
	
	@Column(name="employeename",length=20,nullable=false)
	private String employeeName;
	
	@Column(name="salary",length=20)
	private int salary;
	
	public Employee() {
		super();
	}
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	

}
