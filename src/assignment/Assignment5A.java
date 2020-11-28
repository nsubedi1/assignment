package assignment;

import java.util.Scanner;

public class Assignment5A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter radius to calculate area and circumference of circle: ");
		double radius = sc.nextDouble();
		double area = calculateArea(radius);  
		System.out.println("Area of circle: " + area);
		double circumference = calculateCircumference(radius);
		System.out.println("Circumference of circle: " + circumference);
		sc.close();
	}
	static double calculateArea(double r)
	{
		return (22 * r * r) / 7;
	}
	static double calculateCircumference(double rad)
	{
		return Math.PI * 2 * rad;
	}
}


