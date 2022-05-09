package string;

public class Stringmethods {
	public static void main(String args[]){ 
		
		
		
		
		// charAt()
		String name="priyapatkar";  
		char ch=name.charAt(4);//returns the char value at the 4th index  
		System.out.println(ch); 
		
		
		  String str = "priyawamanraopatkar";          
	        for (int i=0; i<=str.length()-1; i++) {  
	            if(i%2!=0) {  
	                System.out.println("Char at "+i+" place "+str.charAt(i));
	                
	                
	                String str1 = "Welcome to Javatpoint portal";      
	                int strLength = str.length();      
	                // Fetching first character  
	                System.out.println("Character at 0 index is: "+ str1.charAt(0));      
	                // The last Character is present at the string length-1 index  
	                System.out.println("Character at last index is: "+ str1.charAt(strLength-1));  //print last and first char    
		
		// endswith()
	                
	                
	                String s1="pooja patkar";  
	                System.out.println(s1.endsWith("p"));  
	                System.out.println(s1.endsWith("point")); 
	                
	                
	                //equalsIgnoreCase
	                
	                String m1="Ashokrathod";  
	                String m2="ashokrathod";  
	                String m3="ASHOKRATHOD";  
	                String m4="python";  
	                System.out.println(m1.equalsIgnoreCase(m2));//true because content and case both are same  
	                System.out.println(m1.equalsIgnoreCase(m3));//true because case is ignored  
	                System.out.println(m1.equalsIgnoreCase(m4));//false because content is not same 
	                
	                
	                // replaceAll //used req expression
	                String s8="My name is Khan. My name is Bob. My name is Sonoo.";  
	                String replaceString=s1.replaceAll("\\s","");  
	                System.out.println(replaceString); 
	                
	                
	                //tochararray //The java string toCharArray() method converts this string into character arra
	                
	                
	                String s5 = "Welcome to Javatpoint";  
	                char[] ch1 = s1.toCharArray();  
	                int len = ch1.length;  
	                System.out.println("Char Array length: " + len);  
	                System.out.println("Char Array elements: ");  
	                for (int j = 0; j < len; j++) {  
	                    System.out.println(ch1[j]); }
	                
	                
	                
	                
	                
	                
	                
	            
	            
	            }
	            
	            
	        
	}
	        }
	}

	