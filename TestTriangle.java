package exceptionHandling;

import java.util.Scanner;

public class TestTriangle {
	public static void main (String [] args) throws IllegalTriangleException
	{
		double side1;
		double side2;
		double side3;
		Scanner scn = new Scanner (System.in);
		side1=scn.nextDouble();
		side2=scn.nextDouble();
		side3=scn.nextDouble();
		try {
		Triangle triangle = new Triangle(side1, side2, side3);
		System.out.println (triangle.getArea());

		}
		catch (IllegalTriangleException e) {
			System.out.print("Illegal Triangle");
		}
		finally {
			scn.close();
		}
		
	}

}
