package com.java;

public class TypesOfVariables {

	
		int i;
		float f;
		char ch;
		double d;
		String s;
			
			
			
			public static void main(String[] args) {
				int amount=0; //local variables are not initialized
				            //local variables are variables declared inside any method
				
				System.out.println("local amount="+amount);
				TypesOfVariables ob=new TypesOfVariables(); //
				System.out.println("Default values of instance variables");
				System.out.println("int "+ob.i);
				System.out.println("float "+ob.f);
				System.out.println("double "+ob.d);
				System.out.println("String "+ob.s);
				System.out.println("cha "+ob.ch);
				System.out.println("hello"+ 5+6);
				System.out.println("hello"+(5+6));
				System.out.println( 5+6+"hello");
				System.out.println((5+6)+"hello");
			}

		}

