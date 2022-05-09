package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Arraylist{  
public static void main(String args[]){  
 ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
     list.add("Mango");//Adding object in arraylist    
     list.add("Apple");    
     list.add("Banana");    
     list.add("Grapes");    
     //Printing the arraylist object   
     System.out.println(list);  
     
     
     //iterate arraylist using iterator
       
     
     Iterator itr=list.iterator();//getting the Iterator  
     while(itr.hasNext()){//check if iterator has the elements  
      System.out.println(itr.next());//printing the element and move to next  
      
      
      //sorting arraylist
      
      List<String> list1=new ArrayList<String>();  
      list1.add("Mango");  
      list1.add("Apple");  
      list1.add("Banana");  
      list1.add("Grapes");  
      //Sorting the list  
      Collections.sort(list1);  
       //Traversing list through the for-each loop  
      for(String fruit:list1)  
        System.out.println(fruit);  
          
     System.out.println("Sorting numbers...");  
      //Creating a list of numbers  
      List<Integer> list2=new ArrayList<Integer>();  
      list2.add(21);  
      list2.add(11);  
      list2.add(51);  
      list2.add(1);  
      //Sorting the list  
      Collections.sort(list2);  
       //Traversing list through the for-each loop  
      for(Integer number:list2)  
        System.out.println(number);  
     }  
       
    }  
  
} 
