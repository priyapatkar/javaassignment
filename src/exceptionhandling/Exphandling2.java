package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Exphandling2{
public static void findFile() throws IOException {
    // code that may produce IOException
    File newFile=new File("test.txt");
    FileInputStream stream=new FileInputStream(newFile);
  }



  public static void main(String[] args) {
	  
    try{
      findFile();
    } catch(IOException e){
      System.out.println(e);
    }
  }
}
// We use the throws keyword in the method declaration to declare
//the type of exceptions that might occur within it.






