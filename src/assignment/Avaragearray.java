package assignment;

public class Avaragearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total =0;
		double arr[] = {1, 2.6 ,5.7 ,5,3};
		  for ( int i = 0; i< arr.length ; i++) {
			  
			  total = total + arr[i];
		  }
		  
		  double avg = total / arr.length ;
		  
		  System.out.println(avg);
		

	}

}
