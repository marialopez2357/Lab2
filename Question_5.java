package Lab2;

import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {
		
		/*Write a program that computes the tax and tip on a restaurant bill.
		 *  The program should ask the user to enter the charge for the meal. 
		 * The tax should be 6.75 percent of the meal charge. The tip should
		 * be 20 percent of the total after adding tax. 
		 * Display the meal charge, tax amount, tip amount, and total bill on the screen.
		 */

		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Please enter how much your meal was: ");
		
		double bill= sc.nextDouble();
		
		double tax= bill*0.0675;
		double tip= (bill+tax) *0.2;
		double totalBill=bill+tax+tip;
		System.out.println("Your meal charge is: " + bill + "$" );
		System.out.println("Tax to pay:" + tax + "$");
		System.out.println("Tip:" + tip + "$");
		System.out.println("Total to pay:" + totalBill + "$");
		
	}

}
