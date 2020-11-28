package assignment;


import java.util.Scanner;

public class Question11B {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a:  ");
		int a =input .nextInt();
		System.out.println("Enter b:  ");
		int b=input.nextInt();
		System.out.println("before swaping a is:" +a);
		System.out.println("before swaping b is:" +b); 
		int temp =a;
		a=a+b;//11
		b=a-b;//5
		a= a-b;//6
		System.out.println("============");
		System.out.println("after swaping a is:" +a);
		System.out.println("after swaping b is:" +b); 

		input.close();

	}



}





