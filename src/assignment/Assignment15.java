package assignment;

import java.util.Scanner;

public class Assignment15 {

	
		      
			  public static void main(String[] args) {

				    Scanner input = new Scanner(System.in);
				    System.out.print("Enter an ASCII code: ");
				    int number = input.nextInt();
				    input.close();

				    System.out.println("The character for ASCII code " + number + " is "
				            + (char) number);
				}

	}


