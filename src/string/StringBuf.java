package string;

public class StringBuf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer ref = new StringBuffer("priya");
		System.out.println(ref);// creqate mutual string object
		//append()
		
		StringBuffer sb=new StringBuffer("priya ");  
		sb.append("patkar");//now original string is changed  
		System.out.println(sb); 
		
		//insert()
		
		StringBuffer sb1=new StringBuffer("priya ");  
		sb.insert(1,"patkar");//now original string is changed  
		System.out.println(sb);//
		
		
		
		//replace()
		
		
		StringBuffer sb2=new StringBuffer("priya");  
		sb.replace(1,3,"Java");  
		System.out.println(sb);//
		
		
		//delete
		
		StringBuffer sb4=new StringBuffer("priya");  
		sb.delete(1,3);  
		System.out.println(sb);
		
		
		
		//reverse()
		
		
		StringBuffer sb5=new StringBuffer("Hello");  
		sb.reverse();  
		System.out.println(sb);
		
		
		//capacity()
		
		StringBuffer sb6=new StringBuffer();  
		System.out.println(sb.capacity());//default 16  
		sb.append("Hello");  
		System.out.println(sb.capacity());//now 16  
		sb.append("java is my favourite language");  
		System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2 
		
		
		
		//ensureCapacity()
		
		
		StringBuffer sb7=new StringBuffer();  
		System.out.println(sb.capacity());//default 16  
		sb.append("Hello");  
		System.out.println(sb.capacity());//now 16  
		sb.append("java is my favourite language");  
		System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		sb.ensureCapacity(10);//now no change  
		System.out.println(sb.capacity());//now 34  
		sb.ensureCapacity(50);//now (34*2)+2  
		System.out.println(sb.capacity());//now 70  
		
	
	

		  

	}
}


