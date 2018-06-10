package methodsDemo;

import java.util.Scanner;

public class Circle 
{
	     double radious;
	     double pi = 3.14;
		double area(double r)
		{
			radious = r;
			double a = pi*r*r;
			System.out.println("The area of circle is " +a);
			return r;
		}
		double circumference()
		{
			double c =2*pi*radious;
			System.out.println("The circumference of circle is " +c);
			return c;
		}
	public static void main(String[] args) 
	{
		double b;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the circle radious value " );
		b=s.nextDouble();
		Circle c  = new Circle();
		c.area(b);
		c.circumference();
		
	}

}
