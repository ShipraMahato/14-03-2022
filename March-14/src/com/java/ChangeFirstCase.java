package com.java;

public class ChangeFirstCase {

	public static void main(String[] args) {
		
		String s = "we are in cyber world.";
		
	    char[] charArray = s.toCharArray(); // stores each characters to a char array
	    boolean foundSpace = true;

	    for(int i = 0; i < charArray.length; i++) {

	      if(Character.isLetter(charArray[i])) {
	        if(foundSpace)  // check space is present before the letter
	        {	
	          charArray[i] = Character.toUpperCase(charArray[i]);
	          foundSpace = false;
	        }
	      }

	      else {
	    	foundSpace = true;
	      }
	    }

	    s = String.valueOf(charArray);
	    System.out.println("After conversion String is :  " +s);
	}

}
