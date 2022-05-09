package assignment;

import java.sql.Array;
import java.util.Arrays;

public class Chartostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//string to char
//		
//		String sr ="priya";
//		for ( int i= 0; i<sr.length();i++) {
//			 char ch = sr.charAt(i);
//			 System.out.println("character at "+i+" "+"position"+" "+ch);
//		}
//		
//		String srt = "patkar";
//		char[] ch = srt.toCharArray();
//		System.out.println(Arrays.toString(ch));
		
		//char to string
		
		char ch ='a';
				String s1 = String.valueOf(ch);
				System.out.println("string is "+ ch);
				String s2 = Character.toString(ch);
				System.out.println("sting is "+ ch);
		

	}

}
