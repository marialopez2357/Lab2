package Lab2;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		// Write a program that asks the user for a positive nonzero integer value. 
		//The program should use a loop to get the sum of all the integers from 1 up to the number entered. 



		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a number bigger than 0:");
		int num= sc.nextInt();
		int sum=0;
		
		if(num<0) {
			System.out.println("Invalid number, try again.");
			num= sc.nextInt();
		
		}
		for(int i=1;i<=num;i++) {
			sum=sum+i;
		}
		
		System.out.println("the sum of all the numbers from 1 is:" + sum);
		
	}
	    
}
