package assignment;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int temp = 0;

		
		for(int i =2; i<num-1; i++) {
			
			if(num % i == 0) {
				temp = temp+1;
				
			}
		}
			if (temp == 0) {
				System.out.println("given number is  primen ");
			}
			
			else {
				System.out.println("given number is not  prime");
			}
		
		
		
		
		
		
		

	}

}
