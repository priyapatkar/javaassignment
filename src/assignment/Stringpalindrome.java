package assignment;

public class Stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sr = "mam"; String rev ="";
		 for (int i =0; i <=sr.length()-1; i++) {
			  rev = rev + sr.charAt(i);
		 }
			  
			  if(sr.equals(rev)) {
				  System.out.println("given number is palindrome");
			  }
			  else {
				  System.out.println("given name is not palindrome");
			  }
		 
		 
		 

	}

}
