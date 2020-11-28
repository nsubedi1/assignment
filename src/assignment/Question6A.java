package assignment;

import java.util.Scanner;

public class Question6A {

	public static void main(String[] args) {

    	 Scanner input= new Scanner(System.in);
       
        System.out.println("Enter the radius: ");
        
	 double r= input.nextDouble();
        
	 double  c=(22*2*r)/7;
     
	 System.out.println("Perimeter of Circle is: "+c);
	
	}

}
