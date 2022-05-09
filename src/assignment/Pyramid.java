package assignment;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1
//		12
//		123
//		1234
//		
//		for ( int i = 1;i <=4 ; i++) {
//			for( int j = 1; j<=i; j++) {
//				System.out.print(j);
//				
//			}
//			System.out.println();
//			
//		}
		
//		1
//		22
//		333
//		4444
//		for ( int i = 1;i <=4 ; i++) {
//			for( int j = 1; j<=i; j++) {
//				System.out.print(i);
//				
//			}
//			System.out.println();
//			
//		}
//		
//		1
//		23
//		456
//		78910
//		int count =0;
//		
//		for (int i=1 ;i<=4; i++) {
//			for (int j=1; j<=i;j++) {
//				count = count +1;
//				
//				System.out.print(count);
//			}
//			System.out.println();
//		}
//		1
//		21
//		451
//		7891
		for ( int i =1; i<=4;i++){
			
			for ( int j=i; j>=1; j--) {
				System.out.print(j);
			}
			System.out.println();
			}
		
		
		
//		   1
//	      2 3 2
//	    3 4 5 4 3
//	  4 5 6 7 6 5 4
//	5 6 7 8 9 8 7 6 5
		
		
		
		
			    int rows = 5, k = 0, count = 0, count1 = 0;

			    for (int i = 1; i <= rows; ++i) {
			      for (int space = 1; space <= rows - i; ++space) {
			        System.out.print("  ");
			        ++count;
			      }

			      while (k != 2 * i - 1) {
			        if (count <= rows - 1) {
			          System.out.print((i + k) + " ");
			          ++count;
			        } else {
			          ++count1;
			          System.out.print((i + k - 2 * count1) + " ");
			        }

			        ++k;
			      }
			      count1 = count = k = 0;

			      System.out.println();
			    }
			  }
				
		}


