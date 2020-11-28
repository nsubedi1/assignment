package assignment;

import java.util.Scanner;

class Assignment3A {

	public static void main(String[] args) {
		int a, b, sum;

       Scanner input= new Scanner(System.in);

		System.out.print("Enter first number : ");
		a = input.nextInt();

		System.out.print("Enter second number : ");
		b =input.nextInt();

		/*Calculate sum */
		sum = a + b;
		System.out.print("Sum : " + sum);
		input.close();
	}

}
