package string;



	class Tostrng{  
		 int rollno;  
		 String name;  
		 String city;  
		  
		 Tostrng(int rollno, String name, String city){  
		 this.rollno=rollno;  
		 this.name=name;  
		 this.city=city;  
		 }  
		   
		 public String toString(){//overriding the toString() method  
		  return rollno+" "+name+" "+city;  
		 }  
		 public static void main(String args[]){  
			 Tostrng s1=new Tostrng(101,"Raj","lucknow");  
			 Tostrng s2=new Tostrng(102,"Vijay","ghaziabad");  
		     
		   System.out.println(s1);//compiler writes here s1.toString()  
		   System.out.println(s2);//compiler writes here s2.toString()  
		 } 
		 
	}

		