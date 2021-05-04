package Lab2;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		// Question-4

/* Write a program that asks user for the number of males 
 * and the number of females registered in a class. The program
 * should display the percentage of males and females in the class.
 */

		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number of females in the class: ");
		int females= sc.nextInt();
	    
		System.out.print("Enter the number of males in the class: ");
		int males=sc.nextInt();
		
		double totalAmount= females+males;
		
		double PercentFemales=(females/totalAmount) *100;
		double PercentMales=(males/totalAmount) *100;
		
		System.out.println("The percentage of girls in the class is: " + PercentFemales + "%. And the percentage of boys is :" + PercentMales + "%.");
		
	}

}
