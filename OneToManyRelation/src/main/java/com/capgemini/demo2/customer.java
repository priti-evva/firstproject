package com.capgemini.demo2;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Customer_Id")
	private int customerId;
	@Column(name="Customer_name")
    private String customer_name;
	
	public customer(int customerId, String customer_name) {
		super();
		this.customerId = customerId;
		this.customer_name = customer_name;
	}
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	@ManyToMany(targetEntity=Product.class)
	//@JoinColumn(name = "productId")
	private List<customer> customer;

	public List<customer> getCustomer() {
		return customer;
	}
	public void setCustomer(List<customer> customer) {
		this.customer = customer;
	}
	public customer(List<customer> customer) {
		super();
		this.customer = customer;
	}
	public void setProduct(Product prod) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	 

	
	
	

}
