package assignment;

import java.util.Scanner;

public class Question11A {
	

	

		public static void main(String[] args) {
			//swapping
			Scanner input= new Scanner(System.in);
			System.out.println("Enter a:  ");
			int a =input .nextInt();
			System.out.println("Enter b:  ");
			int b=input.nextInt();
			System.out.println("before swaping a is:" +a);
			System.out.println("before swaping b is:" +b); 
			int temp =a;
			a=b;
			b=temp;
			System.out.println("after swaping a is:" +a);
			System.out.println("after swaping b is:" +b); 
			
			input.close();

}
}
