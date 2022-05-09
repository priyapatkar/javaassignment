package constructor;



public class Constructor1 {

	
		String name;
		int contact;
		
		Constructor1(String name,int contact){
			this.name= name;
			this.contact = contact;
		}
		
		void display() {
				
				System.out.println(name +"  "+contact);
		}
		
		
		
		
		 public static void main(String args[]) {
			 
			 Constructor1 s1 = new  Constructor1("priya",64436876);
			 Constructor1 s2 = new  Constructor1("pooja",64436676);
			 s1.display();
			 
			 s2.display();
			 
		 }
}
	