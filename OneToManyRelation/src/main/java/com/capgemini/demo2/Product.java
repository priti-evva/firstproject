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
@Table(name="Product")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Product_ID")
	private int productId;
	
	@Column(name="Product_Name")
	private String productName;
	
	@Column(name="Product_price")
	private int productPrice;
	public Product() {
		super();
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	@ManyToMany(targetEntity=customer.class)
	private List<Product> products;
    
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Product(List<Product> products) {
		super();
		this.products = products;
	}
	
	
	

}
