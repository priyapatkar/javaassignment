package assignment;

import java.util.Scanner;

public class Oddoreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner (System.in);
		System.out.println("Enter your number");
		int num = scr.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Given number is even");
		}
		else {
			System.out.println("Given number is odd");
		}

	}

}
