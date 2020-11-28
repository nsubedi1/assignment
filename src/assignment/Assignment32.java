package assignment;

import java.util.Scanner;


public class Assignment32 {
	//32.Write a Program to accept 5 values in an array and display their sum.
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int size=input.nextInt();
		int[]arr=new int[size];

		int temp=0;

		System.out.println("input your array element: ");
		for (int i = 0; i < arr.length; i++) {

			arr[i]=input.nextInt();

		}

		for(int i=0; i<arr.length; i++) {
			for(int j=i;j<arr.length;j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<size;i++)
			System.out.println(arr[i]+",");

	}
}
