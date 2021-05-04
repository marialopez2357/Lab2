package Lab2;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		
		/*A bag of cookies holds 40 cookies. The calorie information on the bag 
		 *claims that there are 10 serving in the bag and that a serving equals 300 calories.
		 *write a program that lets the user enter the number of cookies he or 
		 *she actually ate and then reports the number of total calories consumed.
		 */
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Enter the number of cookies that you ate: ");
		
		int cookiesEaten= sc.nextInt();
		int totalCookies=40/10;
		int CookiesCalories=300/totalCookies;
		
		
		int totalCalories=cookiesEaten*CookiesCalories;
		System.out.println("The camount of calories consumed is: " + totalCalories);
		


	}

}
