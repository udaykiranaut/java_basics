package methodsDemo;

import java.util.Scanner;

public class Square
{ 	
	double findSquare(double n)
	{
		double s = n*n;
		System.out.println("The square of the number -- " +n +" is " +s);
		return s;
	}

	public static void main(String[] args) 
	{
		double v;
		Scanner value = new Scanner(System.in);
		System.out.println("please enter the value for which you want to find square");
		v = value.nextDouble();
		Square sq = new Square();
		sq.findSquare(v);
		
	

	}

}
