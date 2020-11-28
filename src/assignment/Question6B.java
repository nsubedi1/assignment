package assignment;

import java.util.Scanner;

public class Question6B {

	public static void main(String[] args) {
		//P=a+b+c
		Scanner input =new Scanner(System.in);
		System.out.println("Enter a:" );
		double a=input.nextDouble();
		System.out.println("Enter b:" );
		double b= input.nextDouble();
		System.out.println("Enter c:" );
		double c=input.nextDouble();
		
		double p=a+b+c;
		System.out.println(p);
	}

}
