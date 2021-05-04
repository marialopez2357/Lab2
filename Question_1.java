package Lab2;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		int greatestNum=0;
		int smallestNum=0;
		
		System.out.print("Enter your first number:");
		
		int firstNum=sc.nextInt();
		
		System.out.print("Enter your next number:");
		int nextNum=sc.nextInt();
		
		
		System.out.print("Do you want to enter another number: 0-No, 1-Yes");
		
		int answer= sc.nextInt();
		
		if(answer==0) {
		
		if(firstNum<nextNum) {
				smallestNum=firstNum;
				greatestNum=nextNum;
					
		}else {
			smallestNum=nextNum;
			greatestNum=firstNum;
		}
		
					
		while (answer==1); { 
			System.out.print("Enter your next number:");
			int newNum=sc.nextInt();
			 
			if(newNum> firstNum && newNum > nextNum) {
				greatestNum=newNum;
			}else {
				smallestNum=newNum;
				
				
			}
			System.out.println("Smallest number is: " + smallestNum);
			System.out.println("Greatest number is: " + greatestNum);
		}	
			
	   
		}
		
}
}

