package assignment;

public class Pyramidpatettern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //      *
//		**
//		***
//		****
//		for (int i= 1; i<=5;i++ ) {
//			for(int j=1; j<=i; j++) {
//				
//			
//			System.out.print('*');
//			}
//			System.out.println();
//		}
//			
//		
//		
//		
////		
////		****
////		***
////		**
////		*
//		for (int i =1; i<=5 ;i++) {
//			
//			for (int j =4 ; j>=i ; j--) {
//				System.out.print('*');
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
		
//		    *
//		   **
//		  ***
//		 ****
//		
//		for ( int i =1; i<=4; i++) {
//			for ( int j =3; j>=i; j--) {
//				
//				System.out.print(" ");
//				
//			}
//			for (int c= 1; c<=i; c++) {
//				System.out.print('*');
//			}
//			
//			System.out.println();
//		}
//		
		
//		
//		    *
//	      * * *
//	    * * * * *
//	  * * * * * * *
//	* * * * * * * * *
//		
//		
		
		
//		int rows = 5, k = 0;
//
//	    for (int i = 1; i <= rows; ++i, k = 0) {
//	      for (int space = 1; space <= rows - i; ++space) {
//	        System.out.print("  ");
//	      }
//
//	      while (k != 2 * i - 1) {
//	        System.out.print("* ");
//	        ++k;
//	      }
//
//	      System.out.println();
//	    }
//	
	  
	
	
	
//	* * * * * * * * *
//	  * * * * * * *
//	    * * * * *
//	      * * *
//	        *
	
	int rows = 5;

    for(int i = rows; i >= 1; --i) {
      for(int space = 1; space <= rows - i; ++space) {
        System.out.print("  ");
      }

      for(int j=i; j <= 2 * i - 1; ++j) {
        System.out.print("* ");
      }

      for(int j = 0; j < i - 1; ++j) {
        System.out.print("* ");
      }

      System.out.println();
    }
			
			

	}

}



