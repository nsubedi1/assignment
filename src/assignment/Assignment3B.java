package assignment;

import java.util.Scanner;

public class Assignment3B {

	public static void main(String[] args) {
		 int a, b, sum;
	        double avg;

	        Scanner buf = new Scanner(System.in);

	        System.out.print("Enter first number : ");
	        a = buf.nextInt();

	        System.out.print("Enter second number : ");
	        b = buf.nextInt();

	        /*Calculate average*/
	       
	        avg = (double)((a + b) / 2);

	        System.out.print("Average : " + avg);
	    

	}

}
