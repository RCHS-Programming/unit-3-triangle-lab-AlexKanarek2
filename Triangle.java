//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Alex Kanarek
//Date - 10-08-2020

import java.util.Scanner;
import java.lang.Math.*; 

public class Triangle
{
	private int sideA, sideB, sideC;

	public Triangle(int a, int b, int c)
	{
    sideA = a;
    sideB = b;
    sideC = c;
	}

	public int getPerimeter( )
	{
    return sideA + sideB + sideC;
	}

	public double getArea( )
	{
    double perimeter = getPerimeter( );
    double s = perimeter/2;
    double a = s - sideA;
    double b = s - sideB;
    double c = s - sideC;

		return Math.sqrt( s * a * b * c);
	}
}