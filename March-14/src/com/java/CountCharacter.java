package com.java;

import java.util.Scanner;

public class CountCharacter {

	public static void main(String[] args) {
		  
	        int count = 0;    
	     Scanner sc= new Scanner(System.in);      
	        String str = sc.next();  
	        sc.close();
	        System.out.println("Enter the String : ");
	        for(int i = 0; i < str.length(); i++) {    
	             
	                count++;    
	        }     
	        System.out.println("Total number of characters in a string: " + count);   
	}

}
