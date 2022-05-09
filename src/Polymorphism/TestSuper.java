package Polymorphism;

class Animal{  
String color="white"; 

void eat(){System.out.println("eating...");}
}  
class Dog extends Animal{  
String color="black"; 
void eat(){System.out.println("eating bread...");} 
void printColor(){  
System.out.println(color);//prints color of Dog class  
System.out.println(super.color);//prints color of Animal class 

super.eat();//invove parents class method
}  
}  
class TestSuper1{  
public static void main(String args[]){ 
	
	
Dog d=new Dog();  
d.printColor();  
}}  
		
		

