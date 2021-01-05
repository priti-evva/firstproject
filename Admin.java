package com.capgemini.view;

import java.util.Scanner;

import com.capgemini.service.StudentSchedular;

public class Admin {
	private static Scanner sc=new Scanner(System.in);
	private static StudentSchedular studSch=new StudentSchedular();
	public static void main(String[] args) {
	          showMenu();
	}
	private static void showMenu() {
		int choice;
		while(true)
		{
			System.out.println("1.add student");
			System.out.println("2.show all students");
			System.out.println("3.show student details by roll number");
			System.out.println("4.show student details by course name");
			System.out.println("5.show count by course name");
			System.out.println("6.exit");
			
			System.out.println("enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:addStudentDetails();
					break;
			case 2:studSch.showallStudent();
					break;
			case 3:studSch.showByrollNumber();
					break;
			case 4:studSch.showByCourseName();
			       break;
			case 5:studSch.countByCourseName();
					break;
			case 6:exit();	
			
			
			}
		}
			
		
		}
		private static void exit() {
		System.out.println("Exit");
		
	}
		private static void addStudentDetails() {
			
			
			
				System.out.println("Enter Student roll number:");
				int rollNumber=sc.nextInt();
			
			
				
				
			System.out.println("Enter Student name");
			String name=sc.next();
			
			System.out.println("Enter Student taken courses");
			int courseCount=sc.nextInt();
			String[] courses=new String[courseCount];
			for(int i=0;i<courseCount;i++) {
				courses[i]=sc.next();
			}
		
			System.out.println(studSch.addStudent(rollNumber, name, courses));
		
			
			
		}
}
				
			
	
			
			       
			
			
			
			
		
	
		
		

