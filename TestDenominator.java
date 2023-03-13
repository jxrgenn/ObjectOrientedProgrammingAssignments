package exceptionHandling;

import java.util.Scanner;

public class TestDenominator {
	public static void main (String [] args)
	{
	final int numerator;
	final int denominator;
	Scanner scn = new Scanner (System.in);
	System.out.println ("Enter numerator");
	numerator=scn.nextInt();
	System.out.println ("Enter denominator");
	denominator=scn.nextInt();
	
	try {
	Fraction fraction = new Fraction (numerator,denominator);
	System.out.println (fraction.getFraction());
	}
	catch (NullDenominatorException nde)
	{
		System.out.println ("Denominator is 0");
	}
	scn.close();
}
}
