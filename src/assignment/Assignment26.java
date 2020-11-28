package assignment;

import java.util.Scanner;

public class Assignment26 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your choice: ");
		int originalNumber=input.nextInt();

		int reverseNumber=0;

		System.out.println("originalNumer is:"+originalNumber);
		while(originalNumber !=0) {
			int temp =originalNumber % 10;
			reverseNumber=reverseNumber * 10 + temp;
			originalNumber=originalNumber / 10;


		}
		System.out.println("Revesed number is:"+reverseNumber);
		input.close();

	}

}



