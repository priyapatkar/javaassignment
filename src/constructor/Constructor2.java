package constructor;



public class Constructor2 {

	
		
			String name;
			int contact;
			
			Constructor2(String name,int contact){
				this.name= name;
				this.contact = contact;
			}
			
			void display() {
					
					System.out.println(name +"  "+contact);
			}
			
			
			
			
			 public static void main(String args[]) {
				 
				 Constructor2 s1 = new  Constructor2("priya",64436876);
				 Constructor2 s2 = new  Constructor2("pooja",64436676);
				 s1.display();
				 
				 s2.display();
				 

	}

}
