package exceptionhandling;

import java.io.FileInputStream;
import java.io.IOException;

public class Expchecked {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 FileInputStream fis = null;
		    //Open a file 
		         fis = new FileInputStream("C:/myfile.txt"); 
		    int k; 
		 
		    //read contents of the file
		        while(( k = fis.read() ) != -1) 
		    { 
		        System.out.print((char)k); 
		    } 
		 
		    //close the file
		    fis.close(); 
		    
		   
		   }
}
		
