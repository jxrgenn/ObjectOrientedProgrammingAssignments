package exceptionHandling;

public class Fraction {
	final int numerator;
	final int denominator;
	
	public Fraction (int numerator, int denominator) throws NullDenominatorException
	{
		if (denominator==0)
		{
			throw new NullDenominatorException();
		}
		this.numerator=numerator;
		this.denominator=denominator;
	}
	public double getFraction ()
	{
		double fraction = (double) numerator/denominator;
		return fraction;
	}
}
