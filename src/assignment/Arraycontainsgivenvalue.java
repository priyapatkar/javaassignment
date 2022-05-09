package assignment;

public class Arraycontainsgivenvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {5, 8, 13, 67, 51};
	    int toFind = 13;
	    boolean found = false;

	    for (int n : num) {
	      if (n == toFind) {
	        found = true;
	        break;
	      }
	    }
	    
	    if(found)
	      System.out.println(toFind + " is found.");
	    else
	      System.out.println(toFind + " is not found.");
	  }
	

	}


