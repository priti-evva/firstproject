package com.capgemini.service;

import java.util.Arrays;
import java.util.Scanner;

import com.capgemini.beans.Student;

public class StudentSchedular {
	
	private  Student[] students=new Student[10];
    private  int counterStudent;
    
    Scanner sc=new Scanner(System.in);
	
	public String addStudent(int rollNumber,String name,String[] courses)
	{
		students[counterStudent++]=new Student(rollNumber, name,courses );
		
		return"student added successfully";
	}


	
	public void countByCourseName() {
		int count=0;
		System.out.println("Enter coursename:");
		String course="";
		course=sc.next();
		for(int i=0;i<counterStudent;i++) {
			String[] courses=students[i].getCourses();
			for(int j=0;j<counterStudent;j++) {
				if(courses[j].equals(course)) {
					count++;
					break;
				}
			}
		}
		System.out.println("taken courses+" +count);
	}
	public void showByrollNumber() {
		for(int i=0;i<counterStudent;i++) {
			String[] courses1=students[i].getCourses();
			int rollnum;
			System.out.println("Enter Roll no:");
			rollnum=sc.nextInt();
			if(students[i].getRollNumber()==rollnum) {
				System.out.println(students[i].getRollNumber());
				System.out.println(students[i].getName());
				System.out.println("courses:+" +Arrays.toString(courses1)+" ");
			
			}
			else {
				System.out.println("Student not present");
			}
		}
	}
	public void showByCourseName() {
		for(int i=0;i<counterStudent;i++) {
			String coursename;
			String[] courses=students[i].getCourses();
			System.out.println("Enter course name:");
			 coursename=sc.next();
			 for(int j=0;j<courses.length;j++) {
					String[] courses1=students[i].getCourses();
			 
			 if(courses[j].equals(coursename)) {
				System.out.println(students[i].getRollNumber());
				System.out.println(students[i].getName());
				System.out.println("courses:+" +Arrays.toString(courses1)+" ");
				
				
			}
			
			 }
		}
	}
	public void showallStudent() {
		for(int i=0;i<counterStudent;i++) {
			String[] courses1=students[i].getCourses();
			System.out.println(students[i].getRollNumber());
			System.out.println(students[i].getName());
		    System.out.println("courses:+" +Arrays.toString(courses1)+" ");
		   
		   
		}
	}
public boolean validateRollnum(int rollnum) {
		
		for(int i=0;i<counterStudent;) {
			
			if(rollnum==students[i].getRollNumber()); 
			{
			System.out.println("duplicate copy try unique rollnummber");
            return true;
		}
}
		return false;                    
	}

				
}		
			
		
				
		
				
				        
		
				
			
			
		
	
			
   

		

			

			
			
			
		
		
		
		

	


