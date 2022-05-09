package basicjava;



public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;  
		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12            //unary operator
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10  
		  
		
		int a=10;  
		int b=10;  
		System.out.println(a++ + ++a);//10+12=22  
		System.out.println(b++ + b++);//10+11=21  
		  
		
		int c=10;  
		int d=-10;  
		boolean e=true;  
		boolean f=false;  
		System.out.println(~c);//-11 (minus of total positive value which starts from 0)  
		System.out.println(~d);//9 (positive of total minus, positive starts from 0)  
		System.out.println(!e);//false (opposite of boolean value)  
		System.out.println(!f);//true  
		
		
		
		int r=10;  
		int s=5;  
		System.out.println(r+s);//15  
		System.out.println(r-s);//5  
		System.out.println(r*s);//50    //arthmatic operator
		System.out.println(r/s);//2  
		System.out.println(r%s);//0  
		
		System.out.println(10*10/5+3-1*4/2);  
		
		System.out.println(10<<2);//10*2^2=10*4=40  
		System.out.println(10<<3);//10*2^3=10*8=80  //left shift operator
		System.out.println(20<<2);//20*2^2=20*4=80  
		System.out.println(15<<4);//15*2^4=15*16=240  
		
		
		System.out.println(10>>2);//10/2^2=10/4=2  
		System.out.println(20>>2);//20/2^2=20/4=5  //right shift operator
		System.out.println(20>>3);//20/2^3=20/8=2
		
		
		int u=10;  
		int y=5;  
		int z=20;  
		System.out.println(u<y&&u<z);//false && true = false  // AND operator
		System.out.println(y<y&y<z);//false & true = false  
		
		
		
		int k=10;  
		int l=5;  
		int m=20;  
		System.out.println(k<l&&k++<m);//false && true = false  
		System.out.println(k);//10 because second condition is not checked  
		System.out.println(k<l&k++<m);//false && true = false  
		System.out.println(k);//11 because second condition is checked  
		
		
		int op1=2;  
		int op2=5;  
		int min=(op1<op2)?op1:op2;  // ternary operator
		System.out.println(min); 
		
		
		int p=10;  
		int q=20;  
		p+=4;//a=a+4 (a=10+4)   //Assignment oprator
		q-=4;//b=b-4 (b=20-4)  
		System.out.println(p);  
		System.out.println(q);  
		

	}

}
