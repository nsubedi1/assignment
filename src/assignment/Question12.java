package assignment;

import java.util.Scanner;

	 public class Question12 {

	 	public static void main(String[] args) {
	 		// TODO Auto-generated method stub
	 		Scanner input=new Scanner(System.in);
	 		System.out.println("Eanter name:   ");
	 		String name =input.nextLine();
	 		System.out.println("Eanter nationality:   ");
	 		String nationality=input.next();
	 		System.out.println("Eanter age:   ");
	 		int age= input.nextInt();

	 		System.out.println("===========   ");
	 		System.out.println("Name is:" + name);
	 		System.out.println("Nationality is:" +nationality);
	 		System.out.println("Age is:"+ age);
	 		System.out.println("============");
	 		
	 		
	 	float f=input.nextFloat();
	 	char  c =input.next().charAt(0);
	 	byte  b =input.nextByte()
	 ;
	 	short  s= input.nextShort();
	 	long  l =input.nextLong();
	 	boolean bb= input.nextBoolean();
	 	input.close();


	 	}

	 

	}


