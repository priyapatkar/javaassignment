package assignment;

public class Vowelndcosonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sr = "priyapatkar";
		consonantvowel(sr);
		

	}

	private static void consonantvowel(String sr) {
		
		 int vowel=0;
		 int consonant=0;
			 
		for( int i=0; i<sr.length(); i++) {
			
			if(isVowel(sr.charAt(i))){
				
				++vowel;
				 
			}
			else {
				++consonant;
				
			}
			
			
		}
		System.out.println("Vowel count is = "+vowel);
		System.out.println("Consonant count is = "+consonant);
		
		
	}

	private static boolean isVowel(char ch) {
		// TODO Auto-generated method stub
		 ch = Character.toUpperCase(ch);
		 
		
		return (ch == 'A' || ch == 'E' || ch =='I' || ch == 'O' || ch =='U');
	}

}
