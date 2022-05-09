package collection;

import java.util.HashSet;
import java.util.Iterator;

class Hashset{  
	 public static void main(String args[]){  
	  //Creating HashSet and adding elements  
	    HashSet<String> set=new HashSet();  
	           set.add("One");    
	           set.add("Two");    
	           set.add("Three");   
	           set.add("Four");  
	           set.add("Five");  
	           Iterator<String> i=set.iterator();  
	           while(i.hasNext())  
	           {  
	           System.out.println(i.next());  
	           }  
	           
	           
	           //ignore duplicate element
	           
	           HashSet<String> set1=new HashSet<String>();  
	           set1.add("Ravi");  
	           set1.add("Vijay");  
	           set1.add("Ravi");  
	           set1.add("Ajay");  
	           //Traversing elements  
	           Iterator<String> itr=set1.iterator();  
	           while(itr.hasNext()){  
	            System.out.println(itr.next()); }
	           
	           
	           
	           //remove element
	           
	           HashSet<String> set11=new HashSet<String>();  
	           set11.add("Ravi");  
	           set11.add("Vijay");  
	           set11.add("Arun");  
	           set11.add("Sumit");  
	           System.out.println("An initial list of elements: "+set11);  
	           //Removing specific element from HashSet  
	           set11.remove("Ravi");  
	           System.out.println("After invoking remove(object) method: "+set11);  
	           HashSet<String> set111=new HashSet<String>();  
	           set111.add("Ajay");  
	           set111.add("Gaurav");  
	           set111.addAll(set111);  
	           System.out.println("Updated List: "+set111);  
	           //Removing all the new elements from HashSet  
	           set111.removeAll(set111);  
	           System.out.println("After invoking removeAll() method: "+set111);  
	           //Removing elements on the basis of specified condition  
	           set111.removeIf(str->str.contains("Vijay"));    
	           System.out.println("After invoking removeIf() method: "+set111);  
	           //Removing all the elements available in the set  
	           set111.clear();  
	           System.out.println("After invoking clear() method: "+set111);
	            
	            
	            
	            
	          }  
	           
	 }  
	  