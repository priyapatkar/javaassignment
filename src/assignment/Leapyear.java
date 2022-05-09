package assignment;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scr = new Scanner(System.in);
    System.out.println("Enter the year");
      int year = scr.nextInt();
      
      if (year % 4 == 0)  {
    	  
    	  if(year % 100 == 0) {
    		  
    		  if(year % 400 == 0) {
    			  System.out.println(year +" "+ "is" +" "+ "leap year");
    			  
    		  }
    		  else {
    			  System.out.println(year +" "+ "is" +" "+ "leap year");
    		  }
    		  
    		  
    	  }
    	  else {
    		  System.out.println(year +" "+ "is" +" "+ "leap year");
    		  
    	  }
    	  
    	  
      }
      else {
    	  System.out.println(year +" "+ "is" + " "+"not"+" "+ "leap year");
      }
	}

}
