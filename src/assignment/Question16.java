package assignment;

import java.util.Scanner;

public class Question16 {
	//Evenodd
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		int  num = input.nextInt();

		/* If number is divisible by 2 then it's an even number
		 * else odd number*/
		if ( num % 2 == 0 )
			System.out.println("Entered number is even");
		else
			System.out.println("Entered number is odd");
	}
}

