package exceptionhandling;

public class Exphandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//try-catch block		
		try {
		 int arr[] = new int[5];
		  arr[20] =6;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index 20 out of bounds for length 5");
		}
//try-catch-finally
		 try{
		       int d = 0;
		       int n =20;
		       int fraction = n/d;
		    }
		  catch(ArithmeticException e){
		    System.out.println("In the catch block due to Exception = "+e);
		  }
		  finally{
			System.out.println("Inside the finally block");
		  }
		 // finally block used to put important codes such as clean up code e.g.
		 //closing the file or closing the connection\
		 //finally block excute exception occure or not.
 //nested try- catch 
		 //outer try catch
		 try {  
			    
	            //inner try block 1   
	            try {  
	    
	                // inner try block 2  
	                try {  
	                    int arr[] = { 1, 2, 3, 4 };  
	  
	                    //printing the array element out of its bounds  
	                    System.out.println(arr[10]);  
	                }  
	    
	                // to handles ArithmeticException  
	                catch (ArithmeticException e) {  
	                    System.out.println("Arithmetic exception");  
	                    System.out.println(" inner try block 2");  
	                }  
	            }  
	    
	            // to handle ArithmeticException   
	            catch (ArithmeticException e) {  
	                System.out.println("Arithmetic exception");  
	                System.out.println("inner try block 1");  
	            }  
	        }  
	    
	        // to handle ArrayIndexOutOfBoundsException   
	        catch (ArrayIndexOutOfBoundsException e4) {  
	            System.out.print(e4);  
	            System.out.println(" outer (main) try block");  
	        }  
	        catch (Exception e5) {  
	            System.out.print("Exception");  
	            System.out.println(" handled in main try-block");  
	        }  
	    }  
		 
		 
		 
		 
		
		
		  
		 
		
	
		
		
		
		
	}
	


