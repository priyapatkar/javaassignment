package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist{  
	 public static void main(String args[]){  
	  
	  LinkedList<String> al=new LinkedList<String>();  
	  al.add("Ravi");  
	  al.add("Vijay");  
	  al.add("Ravi");  
	  al.add("Ajay");  
	  
	  Iterator<String> itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next()); 
	   
	   
	   //adding element
	   
	   LinkedList<String> ll=new LinkedList<String>();  
       System.out.println("Initial list of elements: "+ll);  
       ll.add("Ravi");  
       ll.add("Vijay");  
       ll.add("Ajay");  
       System.out.println("After invoking add(E e) method: "+ll);  
       //Adding an element at the specific position  
       ll.add(1, "Gaurav");  
       System.out.println("After invoking add(int index, E element) method: "+ll);  
       LinkedList<String> ll2=new LinkedList<String>();  
       ll2.add("Sonoo");  
       ll2.add("Hanumat");  
       //Adding second list elements to the first list  
       ll.addAll(ll2);  
       System.out.println("After invoking addAll(Collection<? extends E> c) method: "+ll);  
       LinkedList<String> ll3=new LinkedList<String>();  
       ll3.add("John");  
       ll3.add("Rahul");  
       //Adding second list elements to the first list at specific position  
       ll.addAll(1, ll3);  
       System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+ll);  
       //Adding an element at the first position  
       ll.addFirst("Lokesh");  
       System.out.println("After invoking addFirst(E e) method: "+ll);  
       //Adding an element at the last position  
       ll.addLast("Harsh");  
       System.out.println("After invoking addLast(E e) method: "+ll);  
         
       
       //remove elements
       LinkedList<String> ll1=new LinkedList<String>();  
       ll1.add("Ravi");  
       ll1.add("Vijay");  
       ll1.add("Ajay");  
       ll1.add("Anuj");  
       ll1.add("Gaurav");  
       ll1.add("Harsh");  
       ll1.add("Virat");  
       ll1.add("Gaurav");  
       ll1.add("Harsh");  
       ll1.add("Amit");  
       System.out.println("Initial list of elements: "+ll1);  
     //Removing specific element from arraylist  
          ll1.remove("Vijay");  
          System.out.println("After invoking remove(object) method: "+ll1);   
     //Removing element on the basis of specific position  
          ll1.remove(0);  
          System.out.println("After invoking remove(index) method: "+ll1);   
          LinkedList<String> ll21=new LinkedList<String>();  
          ll21.add("Ravi");  
          ll21.add("Hanumat");  
     // Adding new elements to arraylist  
          ll1.addAll(ll21);  
          System.out.println("Updated list : "+ll1);   
     //Removing all the new elements from arraylist  
          ll1.removeAll(ll21);  
          System.out.println("After invoking removeAll() method: "+ll1);   
     //Removing first element from the list  
          ll1.removeFirst();  
          System.out.println("After invoking removeFirst() method: "+ll1);  
      //Removing first element from the list  
          ll1.removeLast();  
          System.out.println("After invoking removeLast() method: "+ll1);  
      //Removing first occurrence of element from the list  
          ll1.removeFirstOccurrence("Gaurav");  
          System.out.println("After invoking removeFirstOccurrence() method: "+ll1);  
      //Removing last occurrence of element from the list  
          ll1.removeLastOccurrence("Harsh");  
          System.out.println("After invoking removeLastOccurrence() method: "+ll1);  

          //Removing all the elements available in the list       
          ll1.clear();  
          System.out.println("After invoking clear() method: "+ll1);   
   }  
}                   
	   
	 }  
	  