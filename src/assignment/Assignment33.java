package assignment;

import java.util.Scanner;

public class Assignment33 {

	public int[]arrayReturn(Scanner input){
		int size=input.nextInt();
		int[]arr=new int[size];


		System.out.println("input your array element: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=input.nextInt();
		}
		return arr;

	}
	public int[]arrayAssending (int []arr){
		int temp=0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=1;j<arr.length;j++) {
                 if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	public void printArray(int []arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+",");
		}

	}

	public static void main(String[] args) {
		Assignment33 obj =new Assignment33();
		Scanner input=new Scanner(System.in);
		int[]originalArray=obj.arrayReturn(input);
		int[]sortedArrey=obj.arrayAssending(originalArray);
		obj.printArray(sortedArrey);


	}
}