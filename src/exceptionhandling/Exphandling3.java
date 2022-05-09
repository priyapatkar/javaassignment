package exceptionhandling;

public class Exphandling3 {

	
	  static void checkAge(int age) throws ArithmeticException {
	    if (age < 18) {
	      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
	    }
	    else {
	      System.out.println("Access granted - You are old enough!");
	    }
	  }

	  public static void main(String[] args) {
	    checkAge(15); // Set age to 15 (which is below 18...)
	  }
	

}
//The Java throw keyword is used to throw an exception explicitly.
//We can throw either checked or unchecked exceptions in Java by throw keyword.
//It is mainly used to throw a custom exception.

