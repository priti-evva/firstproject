package com.capgemini.demo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DEPARTMENT")
public class Department {
	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name = "Department_Id")
		private long dept_id;
		
		@Column(name = "Department_Name")
		private String dept_name;
		
		public Department() {
			super();
			
		}
		
		@OneToMany(mappedBy = "department")
		private List<Employee> employees;


		public List<Employee> getEmployees() {
			return employees;
		}

		public void setEmployees(List<Employee> employees) {
			this.employees = employees;
		}
		
		

		public long getDept_id() {
			return dept_id;
		}

		public void setDept_id(long dept_id) {
			this.dept_id = dept_id;
		}

		public String getDept_name() {
			return dept_name;
		}

		public void setDept_name(String dept_name) {
			this.dept_name = dept_name;
		}
	}

		


