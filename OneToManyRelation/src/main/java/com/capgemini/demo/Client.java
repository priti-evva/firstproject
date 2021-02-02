package com.capgemini.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitName"); //EntityManager to perform operations on object
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();  
		
		Department dept = new Department();
		dept.setDept_name("Sales");
        em.persist(dept);
        
        Employee emp1 = new Employee();
        emp1.setEmployeeName("priti");
        emp1.setSalary(50000);
		Employee emp2 = new Employee();
		emp2.setEmployeeName("prasad");
		emp2.setSalary(40000);
		
		emp1.setDepartment(dept);
		emp2.setDepartment(dept);
		
		
		em.persist(emp1);
		em.persist(emp2);
		
		em.getTransaction().commit();
		em.close();

	}

}
