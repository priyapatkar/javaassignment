package controlflowstatment;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++){  
			for(int j=1;j<=i;j++){  
			        System.out.print("* ");  
			}  
			System.out.println();//new line  
			}  
		
		
		
		 int arr[]={12,23,44,56,78};  
		    //Printing array using for-each loop  
		    for(int i:arr){  
		        System.out.println(i);  
		    }  

	}

}