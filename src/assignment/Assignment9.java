package assignment;

import java.util.Scanner;

public class Assignment9 {
	public static void main(String[] args) {
		// Create new Scanner object
		Scanner input = new Scanner(System.in); 
		// Create value
		 double KILOGRAMS_PER_POUND = 0.454;	

		// Prompt user to enter the number of pounds
		System.out.print("Enter a number in pounds: ");
		double pounds = input.nextDouble();

		// Convert pounds into kilograms
		double kilograms = pounds * KILOGRAMS_PER_POUND;

		// Display the results
		System.out.println(pounds + " pounds is " + kilograms + " kilograms");
	}
}



