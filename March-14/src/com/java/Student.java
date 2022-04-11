package com.java;

import java.util.Scanner;

public class Student {
	String name;int id;double fee;int age;
	void input() 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Student Name: ");
	 name = sc.next();
	System.out.println("Enter Student Id: ");
	id = sc.nextInt();
	System.out.println("Enter Student Fees: ");
	 fee = sc.nextDouble();
	System.out.println("Enter Student Age: ");
	age = sc.nextInt();
	sc.close();
	}
	void Display() 
	{
		
		System.out.println("Name of student : "+ name);
		System.out.println("Student Id : "+ id);
		System.out.println("Student Fees : "+fee);
		System.out.println("Age of the Student :"+age);
	}
	public static void main(String[] args) {

		Student s=new Student();
		s.input();
		s.Display();
	}

}
