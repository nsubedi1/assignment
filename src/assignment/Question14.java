package assignment;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("enter a: ");
		int a=input.nextInt();
		System.out.println("enter b: ");
		int b=input.nextInt();

		if(a==b) {
			System.out.println(" you have entered negative number.");

		}
		if (a>b) {
			System.out.println(" a is greater than b");

		}
		if (a<b) {
			System.out.println(" a is smaller than b");
		}
	}
}