package methodsDemo;

import java.util.Scanner;

public class SimpleInterestDynamic
{ 	
	double calculate(double p,double t,double r)
	{
		double si = (p*t*r)/100;
		System.out.println("The simple for --" +p +"  for time period --" +t +"  at interest rate " +r +"  is " +si) ;
		return si;
	}

	public static void main(String[] args) 
	{
		double x,y,z;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the values for priciple time and rate of interest ");
		x=s.nextDouble();
		y=s.nextDouble();
		z=s.nextDouble();
		SimpleInterestDynamic sid = new SimpleInterestDynamic();
		sid.calculate(x, y, z);
		

	}

}
