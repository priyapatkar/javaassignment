package string;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "priya "; //using literal
		
		String s1 = new String("patkar");// using new keyword
		
		
		String s2="java";//creating string by Java string literal    
		char ch[]={'s','t','r','i','n','g','s'};    
		String s3=new String(ch);//converting char array to string    
		String s4=new String("example");//creating Java string by new keyword    
		System.out.println(s1);    
		System.out.println(s2);    
		System.out.println(s3);
		
		
		//equals() //The String class equals() method compares the original content of the string
		
		String str1="Sachin";  
		   String str2="Sachin";  
		   String str3=new String("Sachin");  
		   String str4="Saurav";  
		   System.out.println(str1.equals(str2));//true  
		   System.out.println(str1.equals(str3));//true  
		   System.out.println(str1.equals(str4));//false 
		   
		   
		   //== operator //The == operator compares references not values
		   
		   String r1="Patkar";  
		   String r2="Patkar";  
		   String r3=new String("Patkar");  
		   System.out.println(r1==r2);//true (because both refer to same instance)  
		   System.out.println(r1==r3);//false(because s3 refers to instance created in nonpool)
		   
		   
		   // compareTo() //
		   
		   String a1="Sachin";  
		   String a2="Sachin";  
		   String a3="Ratan";  
		   System.out.println(a1.compareTo(a2));//0  
		   System.out.println(a1.compareTo(a3));//1(because s1>s3)  
		   System.out.println(a3.compareTo(a1));//-1(because s3 < s1 ) 
		   
		   

	}

}
