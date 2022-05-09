package assignment;

public class Reversesentense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="priya";
		recursivstring(s);
		System.out.println(recursivstring(s));
		

	}

	private static String recursivstring(String s) {

		if ( s == null || s.length()<=1) {
			
			return s;
			
		}
		return recursivstring(s.substring(1))+s.charAt(0) ;
		
	}

}
