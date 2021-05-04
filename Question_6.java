package Lab2;

import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {
		/*Write a program that will ask the user to enter the amount of a purchase.
		 * The program should then compute the state and county tax sales tax. 
		 * Assume the state sales tax is 4 percent and the county sales tax is 2 percent.
		 * The program should display the amount of the purchase , the state sales tax,
		 *  the county sales tax, the total sales tax, and the total of the sale 
		 *  (which is the sum of the amount of purchase plus the total sales tax)
		 */

		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the amount of your purchase:");
		
		double purchase=sc.nextDouble();
		double stateTax= purchase*0.04;
		double countyTax= purchase*0.02;
		double totalTax= stateTax + countyTax;
		double totalOfSale= purchase + totalTax;
		
		System.out.println("The amount of your purchase is:" + purchase + "$");
	    System.out.println("The state sales tax is:" + stateTax + "$");
	    System.out.println("The county sales tax is:" + countyTax + "$");
	    System.out.println("The total sales tax is:" + totalTax + "$");
	    System.out.println("The total of the sale is:" + totalOfSale + "$");
	
	}

}
