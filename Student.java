package com.capgemini.beans;

public class Student {
	public Student(int rollNumber, String name,String[] courses) {
		super();
		this.rollNumber=rollNumber;
		this.name=name;
		this.courses=courses;
	}
	

	private int rollNumber;
	
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String[] courses;
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	

	
}
