package controlflowstatment;

public class If_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//defining a variable  
	    int number=13;  
	    //Check if the number is divisible by 2 or not  // if_else statement
	    if(number%2==0){  
	        System.out.println("even number");  
	    }else{  
	        System.out.println("odd number");  
	    }
	    
	    
	    
	    int number1=-13;    
	    if(number>0){  
	    System.out.println("POSITIVE");  //if_else_if statment
	    }else if(number<0){  
	    System.out.println("NEGATIVE");  
	    }else{  
	    System.out.println("ZERO");  
	    
	    
	    
	    
	   
	    
	    
	    
	    
	    
	    int age=25;    
	    int weight=48;      
	    //applying condition on age and weight    
	    if(age>=18){      
	        if(weight>50){    
	            System.out.println("You are eligible to donate blood");    
	        } else{  
	            System.out.println("You are not eligible to donate blood");    //nested if statment
	        }  
	    } else{  
	      System.out.println("Age must be greater than 18");  
	    }  

	    }
	}
}


