package com.capgemini.demo2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.demo.Department;
import com.capgemini.demo.Employee;

public class Sales {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitName"); //EntityManager to perform operations on object
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();  
		
		
		Product prod = new Product();
        prod.setProductName("Headset");
        prod.setProductPrice(10000);
        
        Product prod1 = new Product();
        prod1.setProductName("Cellphone");
        prod1.setProductPrice(35000);
        
        Product prod2 = new Product();
        prod2.setProductName("Laptop");
        prod2.setProductPrice(80000);
        
        em.persist(prod);
        em.persist(prod1);
        em.persist(prod2);
        
        customer cust = new customer(1,"priti");
        customer cust1 = new customer(2,"prasad");
        customer cust2 = new customer(3,"panvelkar");
		
		cust.setProduct(prod);
		cust.setProduct(prod1);
		cust.setProduct(prod2);
		
		
		em.persist(cust);
		em.persist(cust1);
		em.persist(cust2);
		
		em.getTransaction().commit();
		em.close();

	}

}
