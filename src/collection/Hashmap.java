package collection;

import java.util.HashMap;
import java.util.Map;

public class Hashmap{  
	 public static void main(String args[]){  
	   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
	   map.put(1,"Mango");  //Put elements in Map  
	   map.put(2,"Apple");    
	   map.put(3,"Banana");   
	   map.put(4,"Grapes");   
	       
	   System.out.println("Iterating Hashmap...");  
	   for(Map.Entry m : map.entrySet()){    
	    System.out.println(m.getKey()+" "+m.getValue()); }
	   
	   
	   //add element
	   
	   
	   HashMap<Integer,String> hm=new HashMap<Integer,String>();    
	    System.out.println("Initial list of elements: "+hm);  
	      hm.put(100,"Amit");    
	      hm.put(101,"Vijay");    
	      hm.put(102,"Rahul");   
	       
	      System.out.println("After invoking put() method ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }  
	        
	      hm.putIfAbsent(103, "Gaurav");  
	      System.out.println("After invoking putIfAbsent() method ");  
	      for(Map.Entry m:hm.entrySet()){    
	           System.out.println(m.getKey()+" "+m.getValue());    
	          }  
	      HashMap<Integer,String> map1=new HashMap<Integer,String>();  
	      map1.put(104,"Ravi");  
	      map1.putAll(hm);  
	      System.out.println("After invoking putAll() method ");  
	      for(Map.Entry m:map1.entrySet()){    
	           System.out.println(m.getKey()+" "+m.getValue());    
	          }  
	      
	      
	      //remove element
	      
	      HashMap<Integer,String> map11=new HashMap<Integer,String>();          
	      map11.put(100,"Amit");    
	      map11.put(101,"Vijay");    
	      map11.put(102,"Rahul");  
	      map11.put(103, "Gaurav");  
	    System.out.println("Initial list of elements: "+map11);  
	    //key-based removal  
	    map11.remove(100);  
	    System.out.println("Updated list of elements: "+map11);  
	    //value-based removal  
	    map11.remove(101);  
	    System.out.println("Updated list of elements: "+map11);  
	    //key-value pair based removal  
	    map11.remove(102, "Rahul");  
	    System.out.println("Updated list of elements: "+map11);  
	    
	    
	    //replace element
	    
	    
	    HashMap<Integer,String> hm2=new HashMap<Integer,String>();    
	      hm.put(100,"Amit");    
	      hm.put(101,"Vijay");    
	      hm.put(102,"Rahul");   
	      System.out.println("Initial list of elements:");  
	     for(Map.Entry m:hm.entrySet())  
	     {  
	        System.out.println(m.getKey()+" "+m.getValue());   
	     }  
	     System.out.println("Updated list of elements:");  
	     hm.replace(102, "Gaurav");  
	     for(Map.Entry m:hm.entrySet())  
	     {  
	        System.out.println(m.getKey()+" "+m.getValue());   
	     }  
	     System.out.println("Updated list of elements:");  
	     hm.replace(101, "Vijay", "Ravi");  
	     for(Map.Entry m:hm.entrySet())  
	     {  
	        System.out.println(m.getKey()+" "+m.getValue());   
	     }   
	     System.out.println("Updated list of elements:");  
	     hm.replaceAll((k,v) -> "Ajay");  
	     for(Map.Entry m:hm.entrySet())  
	     {  
	        System.out.println(m.getKey()+" "+m.getValue());   
	     }  
	    
	    
	    
	    
	}  
	}  
