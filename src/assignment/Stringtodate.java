package assignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Stringtodate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat ("dd-MM-yy hh:mm:ss");
		
		String date="02-08-1997 12:67:23";
		
		System.out.println(sdf.parse(date));
		

	}

}
